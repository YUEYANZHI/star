package com.design.pattern.strategy.stack;

/**
 * @author Yue YanZhi
 * @description TODO
 * @date 2022-04-25 10:58
 */
public class StackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        int pop = stack.pop();
        System.out.println(pop);
    }
}
