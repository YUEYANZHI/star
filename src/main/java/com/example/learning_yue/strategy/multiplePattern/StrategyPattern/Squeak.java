package com.design.pattern.strategy.multiplePattern.StrategyPattern;

import com.design.pattern.strategy.multiplePattern.StrategyPattern.QuackBehavior;

/**
 * @author yueyz
 * @date 2021-12-05-18:24
 */
public class Squeak implements QuackBehavior {
    /**
     * 吱吱叫
     */
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
