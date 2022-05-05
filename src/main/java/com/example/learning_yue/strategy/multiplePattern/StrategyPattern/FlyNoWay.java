package com.design.pattern.strategy.multiplePattern.StrategyPattern;

import com.design.pattern.strategy.multiplePattern.StrategyPattern.FlyBehavior;

/**
 * @author yueyz
 * @date 2021-12-05-18:23
 */
public class FlyNoWay implements FlyBehavior {
    /**
     * 实现鸭子的接口行为
     */
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
