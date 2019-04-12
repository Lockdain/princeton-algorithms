package ru.msk.java.runner;

import ru.msk.java.io.Reader;
import ru.msk.java.util.PropertiesLoader;

import java.io.IOException;
import java.util.Properties;

public class Main {

    public static final String INPUT_PROPS = "input";

    public static void main(String[] args) throws IOException {
        PropertiesLoader propertiesLoader = new PropertiesLoader("application.properties");
        Properties properties = propertiesLoader.getProperties();

        String fileName = properties.getProperty(INPUT_PROPS);
        Reader reader = new Reader(fileName);
        System.out.println(reader.getInputData());
    }
}
