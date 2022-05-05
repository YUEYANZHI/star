package com.design.pattern.strategy.concurrentprogramming;

/**
 * @author yueyz
 * @date 2022-02-21-10:42
 */
public class ConcurrentVisibility {
    public static long count = 0;

    public void add10k() {
        int idx = 0;
        while (idx++ < 10000) {
            count += 1;
        }
        System.out.println(count);
    }
}
