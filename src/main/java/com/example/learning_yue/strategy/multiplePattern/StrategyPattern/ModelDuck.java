package com.design.pattern.strategy.multiplePattern.StrategyPattern;

/**
 * @author yueyz
 * @date 2021-12-05-19:04
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
        duckCall = new DuckCallDuck();
    }

    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
}
