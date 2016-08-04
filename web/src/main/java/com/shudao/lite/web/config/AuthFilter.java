package com.shudao.lite.web.config;

import com.shudao.lite.web.controller.LoginController;
import org.javalite.activeweb.controller_filters.HttpSupportFilter;

/**
 * Created by dali on 16/6/28.
 */
public class AuthFilter  extends HttpSupportFilter {

    @Override
    public void before() {

        if(!controllerProtected()){
            return;
        }

        if(session("UserName") == null && controllerProtected()){
            redirect(LoginController.class,"login");
        }
    }

    private boolean controllerProtected() {
        return getRoute().getController().getClass().getAnnotation(Protected.class) != null;
    }
}
