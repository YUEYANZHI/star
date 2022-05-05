package com.design.pattern.strategy.multithreading.thred;

/**
 * @author yueyz
 * @date 2022-01-13-14:32
 */
public class SecondThread implements Runnable {
    @Override
    public void run() {
        //当线程类实现Runnable接口时，如果想获取当前线程，只能使用Thread.currentThread().getName()
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}
