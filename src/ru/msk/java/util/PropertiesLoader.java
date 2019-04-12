package ru.msk.java.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * Loads preferences from properties file
 */
public class PropertiesLoader {

    private final String CLASS_NAME = getClass().getName();
    private final Logger log = Logger.getLogger(getClass().getName());
    private Properties properties;


    public PropertiesLoader(Properties properties) {
        this.properties = properties;
    }

    public PropertiesLoader(String propsFileName) {
        String methodName = "PropertiesLoader";
        log.entering(CLASS_NAME, methodName);

        Properties properties = new Properties();
        try (InputStream is = getClass().getResourceAsStream(propsFileName)) {
            properties.load(is);
        } catch (IOException e) {
            log.warning("IO exception: " + e.getMessage());
            throw new RuntimeException("Error:", e);
        }
        this.properties = properties;

        log.entering(CLASS_NAME, methodName);
    }

    public Properties getProperties() {
        return properties;
    }
}
