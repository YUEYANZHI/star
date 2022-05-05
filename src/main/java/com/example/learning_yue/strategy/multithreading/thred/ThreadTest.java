package com.design.pattern.strategy.multithreading.thred;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author yueyz
 * @date 2022-01-13-11:21
 */
public class ThreadTest {
    public static void main(String[] args) {
        //调用Thread的currentThread方法获取当前线程
       /* for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "--" + i);

            if (i == 20) {
                //创建并启动第一个线程
                new FirstThread().start();
                //创建并启动第二个线程
                new FirstThread().start();
            }
        }*/
        //实现Runnable
        /*for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
            if (i==20){
                SecondThread sc = new SecondThread();
                new Thread(sc,"新线程1").start();
                new Thread(sc,"新线程2").start();
            }
        }*/
        //Callable
        //先使用Lambada表达式创建Callable<Integer>对象
        //使用FutureTask来包装Callable对象
        FutureTask<Integer> task = new FutureTask<>((Callable<Integer>) () -> {
            int i = 0;
            for (; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "循环变量i的值" + i);
            }
            //call方法可以有自己的返回值
            return i;
        });
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "循环变量i的值" + i);
            if (i==20){
                //实质还是以Callable对象来创建并启动线程的
                new Thread(task,"有返回值的线程").start();
            }
        }

        try{
            System.out.println(task.get());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
