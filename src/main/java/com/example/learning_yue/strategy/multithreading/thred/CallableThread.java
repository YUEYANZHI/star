package com.design.pattern.strategy.multithreading.thred;

import java.util.concurrent.Callable;

/**
 * @author yueyz
 * @date 2022-01-13-15:47
 */
public class CallableThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int i = 0;
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "循环变量i的值" + i);
        }
        return i;
    }
}
