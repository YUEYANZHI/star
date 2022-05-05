package com.design.pattern.strategy.stack;

import com.sun.corba.se.impl.oa.toa.TOA;

/**
 * @author Yue YanZhi
 * @description TODO
 * @date 2022-04-25 10:51
 */
public class MyStack {
    private int maxSize;//定义栈的大小
    private int top = -1;//栈顶
    private int[] stack;

    //构造器初始化一个栈
    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[this.maxSize];

    }

    //判断栈是否满
    public boolean isFull() {
        return top == maxSize - 1;
    }

    //p判断栈空
    public boolean isEmpty() {
        return top == -1;
    }

    //入栈
    public void push(int data) {
        //先判断栈是否满
        if (!isFull()) {
            top++;
            stack[top] = data;

        } else {
            System.out.println("栈满");
        }
    }

    //出栈
    public int pop() {
        //先判断栈是否为空
        if (isFull()) {
            //抛出异常
            throw new RuntimeException("栈空");

        }
        int val = stack[top];
        top--;

        return val;
    }

    //遍历栈
    public void list() {
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d]=%d\n", i, stack[i]);


        }
    }

}
