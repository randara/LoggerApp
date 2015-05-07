package com.example.logger;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rafaelandara on 5/7/15.
 */
public class LoggerTest {

    @Test
    public void simpleLogTest() {
        String classname = "SOMECLASS";
        String level = "INFO";
        String message = "something happen";

        String expectedMessage = "time localhost SOMECLASS: [INFO] something happen";

        Logger logger = LoggerFactory.getLogger(LoggerType.CONSOLE, LogLevel.INFO);

        String logMessage = logger.log(classname, message, LogLevel.INFO, true);

        Assert.assertEquals(expectedMessage, logMessage);

        System.out.print(logMessage);

    }

}