package com.shudao.lite.web.config;

import org.javalite.activeweb.AbstractControllerConfig;
import org.javalite.activeweb.AppContext;

/**
 * Created by dali on 16/6/28.
 */
public class ControllerConfig extends AbstractControllerConfig{
    @Override
    public void init(AppContext appContext) {
        addGlobalFilters(new AuthFilter());
    }
}
