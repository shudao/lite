package app.config;

import freemarker.ext.beans.BeansWrapper;
import org.javalite.activeweb.freemarker.AbstractFreeMarkerConfig;

/**
 * Created by dali on 16/6/28.
 */
public class FreeMarker extends AbstractFreeMarkerConfig {
    @Override
    public void init() {
        getConfiguration().setNumberFormat("0.##");
        getConfiguration().setSharedVariable("statics", BeansWrapper.getDefaultInstance().getStaticModels());
        getConfiguration().setSharedVariable("enums", BeansWrapper.getDefaultInstance().getEnumModels());
    }
}

