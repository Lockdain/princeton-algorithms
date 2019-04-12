package ru.msk.java.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Logger;

/**
 * Работа с исходным файлом,
 * содержащим записи о вершинах графа
 */
public class Reader {

    private final Logger log = Logger.getLogger(getClass().getName());
    private final String CLASS_NAME = getClass().getName();
    private Path path;

    public Reader(String filename) throws IOException {
        this.path = Paths.get(filename);
    }

    public List<String> getInputData() throws IOException {
        String methodName = "getInputData";
        log.entering(CLASS_NAME, methodName);

        List<String> strings = null;

        if (null == this.path) {
            throw new IllegalStateException("Reader was not correctly initialized");
        } else {
            strings = Files.readAllLines(path);
        }
        log.exiting(CLASS_NAME, methodName);
        return strings;
    }
}
