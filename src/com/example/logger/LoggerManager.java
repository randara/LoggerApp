package com.example.logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafaelandara on 5/7/15.
 */
public class LoggerManager {

    private List<Logger> loggers;

    public LoggerManager() {
        loggers = new ArrayList<>();
    }

    public void add(Logger logger) {
        loggers.add(logger);
    }

    public boolean remove(Logger logger) {
        return loggers.remove(logger);
    }

    public int size() {
        return loggers.size();
    }

    public void log(String classname, String message, LogLevel level) {
        for(Logger logger : loggers)
            logger.log(classname, message, level);
    }

    public void info(String classname, String message) {
        for(Logger logger : loggers)
            logger.log(classname, message, LogLevel.INFO);
    }

    public void warn(String classname, String message) {
        for(Logger logger : loggers)
            logger.log(classname, message, LogLevel.WARN);
    }

    public void error(String classname, String message) {
        for(Logger logger : loggers)
            logger.log(classname, message, LogLevel.ERROR);
    }

    public void debug(String classname, String message) {
        for(Logger logger : loggers)
            logger.log(classname, message, LogLevel.DEBUG);
    }

}
