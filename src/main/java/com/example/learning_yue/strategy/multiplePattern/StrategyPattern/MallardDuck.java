package com.design.pattern.strategy.multiplePattern.StrategyPattern;

/**
 * @author yueyz
 * @date 2021-12-04-09:51
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
  public   void display() {
        System.out.println("I’m a real Mallard duck");
    }
}
