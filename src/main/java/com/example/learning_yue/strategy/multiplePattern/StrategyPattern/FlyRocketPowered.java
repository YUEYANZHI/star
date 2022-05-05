package com.design.pattern.strategy.multiplePattern.StrategyPattern;

import com.design.pattern.strategy.multiplePattern.StrategyPattern.FlyBehavior;

/**
 * @author yueyz
 * @date 2021-12-05-19:06
 */
public class FlyRocketPowered implements FlyBehavior {
    /**
     * 可有利用火箭进行飞行
     */
    @Override
    public void fly() {
        System.out.println("I'm flying with rocket");
    }
}
