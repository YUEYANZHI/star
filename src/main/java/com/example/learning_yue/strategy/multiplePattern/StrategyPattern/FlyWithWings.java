package com.design.pattern.strategy.multiplePattern.StrategyPattern;

import com.design.pattern.strategy.multiplePattern.StrategyPattern.FlyBehavior;

/**
 * @author yueyz
 * @date 2021-12-05-18:23
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
