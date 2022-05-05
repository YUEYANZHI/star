package com.design.pattern.strategy.concurrentprogramming.dto;

public class Counter {

    private long value;

    synchronized long get() {
        return value;
    }

    synchronized long addOne() {
        return ++value;
    }
}
