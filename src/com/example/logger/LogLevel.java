package com.example.logger;

/**
 * Created by rafaelandara on 5/7/15.
 */
public enum LogLevel {
    DEBUG(0),
    ERROR(1),
    WARN(2),
    INFO(3);

    public final int value;


    LogLevel(int level) {
        this.value = level;
    }
}
