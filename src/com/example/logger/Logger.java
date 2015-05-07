package com.example.logger;

/**
 * Created by rafaelandara on 5/7/15.
 */
abstract public class Logger {

    private LogLevel logLevel;

    abstract protected void log(String classname, String message, LogLevel level);

    public String log(String classname, String message, LogLevel level, Boolean isTest) {
        String formattedMessage = null;
        if (isTest) {
            formattedMessage = getFormattedMessage(classname, message, level);
        }
        return formattedMessage;
    }

    public String getFormattedMessage(String classname, String message, LogLevel level) {
        return String.format("%s %s %s: [%s] %s", "time", "localhost", classname, level, message);
    }

    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    public void setLogLeve(LogLevel level) {
        this.logLevel = level;
    }
}
