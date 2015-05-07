package com.example.logger;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rafaelandara on 5/7/15.
 */
public class LoggerTest {

    @Test
    public void simpleLogTest() {
        String classname = "SOMECLASS";
        String message = "something happen";

        String expectedMessage = "time localhost SOMECLASS: [INFO] something happen";

        Logger logger = LoggerFactory.getLogger(LoggerType.CONSOLE, LogLevel.INFO);

        String logMessage = logger.log(classname, message, LogLevel.INFO, true);

        Assert.assertEquals(expectedMessage, logMessage);

    }

    @Test
    public void logLevelTest() {
        String classname = "SOMECLASS";
        String message = "something happen";

        String expectedMessage = null;

        Logger logger = LoggerFactory.getLogger(LoggerType.CONSOLE, LogLevel.INFO);

        String logMessage = logger.log(classname, message, LogLevel.DEBUG, true);

        Assert.assertEquals(expectedMessage, logMessage);

    }

}