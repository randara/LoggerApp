package com.example.logger;

/**
 * Created by rafaelandara on 5/7/15.
 */
public class ConsoleLogger extends Logger {

    public ConsoleLogger(LogLevel level) {
        setLogLeve(level);
    }

    @Override
    protected void log(String classname, String message, LogLevel level) {
        if(level.value >= getLogLevel().value)
            System.out.println(getFormattedMessage(classname, message, level));
    }


}
