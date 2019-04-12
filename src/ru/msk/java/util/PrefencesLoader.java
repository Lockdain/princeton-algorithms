package ru.msk.java.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * Loads preferences from properties file
 */
public class PrefencesLoader {

    private final Logger log = Logger.getLogger(getClass().getName());
    private Properties properties;


    public PrefencesLoader(Properties prefs) {
        this.properties = prefs;
    }

    public PrefencesLoader(String prefsFileName) {
        Properties properties = new Properties();
        try (InputStream is = getClass().getResourceAsStream(prefsFileName)) {
            properties.load(is);
        } catch (IOException e) {
            log.warning("IO exception: " + e.getMessage());
            throw new RuntimeException("Error:", e);
        }
        this.properties = properties;
    }

    public Properties getPrefs() {
        return properties;
    }
}
