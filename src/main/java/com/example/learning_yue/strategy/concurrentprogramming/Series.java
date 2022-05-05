package com.design.pattern.strategy.concurrentprogramming;

public class Series {

    public static void main(String[] args) {
        int[] num = fibonacci(10);
        for (int i : num) {
            System.out.print(i+",");
        }
    }
    // 返回斐波那契数列
    private static int[] fibonacci(int n) {
        // 创建结果数组
        int[] r = new int[n];
        // 初始化第一、第二个数
        r[0] = r[1] = 1;  // ①
        // 计算2..n
        for(int i = 2; i < n; i++) {
            r[i] = r[i-2] + r[i-1];
        }
        return r;
    }
}
