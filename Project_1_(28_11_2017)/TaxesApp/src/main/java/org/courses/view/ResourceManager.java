package org.courses.view;

import java.util.Locale;
import java.util.ResourceBundle;

public enum ResourceManager {
    INSTANCE;

    private ResourceBundle resourceBundle;
    private final String RESOURCE_BUNDLE_NAME = "messages";

    ResourceManager() {
        resourceBundle = ResourceBundle.getBundle(RESOURCE_BUNDLE_NAME, Locale.getDefault());
    }

    /**
     * change resource bundle locale
     * @param locale locale
     */
    public void changeResource(String locale){
        resourceBundle = ResourceBundle.getBundle(RESOURCE_BUNDLE_NAME, new Locale(locale));
    }

    public String getString(String key){
        return resourceBundle.getString(key);
    }

}
