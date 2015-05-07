package com.example.logger;

/**
 * Created by rafaelandara on 5/7/15.
 */
public class LoggerFactory {

    public static Logger getLogger(LoggerType type, LogLevel level) {
        return getLogger(type, level, "");
    }

    public static Logger getLogger(LoggerType type, LogLevel level, String path) {

        Logger logger = null;

        switch(type) {

            case FILE:
                logger = new FileLogger(level, path);
                break;
            case ASYNC:
                logger = new AsyncLogger(new FileLogger(level, path));
                break;
            case CONSOLE:
            default:
                logger = new ConsoleLogger(level);
                break;
        }

        return logger;
    }


}
