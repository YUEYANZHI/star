package com.design.pattern.strategy.multiplePattern.StrategyPattern;

import com.design.pattern.strategy.multiplePattern.StrategyPattern.QuackBehavior;

/**
 * @author yueyz
 * @date 2021-12-05-18:24
 */
public class Quack implements QuackBehavior {
    /**
     * 鸭叫声
     */
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
