package com.design.pattern.strategy.multithreading.thred;

/**
 * @author yueyz
 * @date 2022-01-13-10:44
 */
public class FirstThread extends Thread {

    //重写run方法 run方法就是线程执行体
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //当线程继承Thread类时，直接使用this即可获取当前线程
            //Thread对象的getName()返回当前线程的名字
            //因此可以直接调用getName（）方法返回当前线程的名字
            System.out.println(getName()+"--"+i);
        }
    }

}
