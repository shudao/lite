package app.controllers;

import org.javalite.activeweb.AppController;

/**
 * Created by dali on 16/6/28.
 */
public class LoginController extends AppController{

    public void login(){
        render().noLayout();
    }
}
