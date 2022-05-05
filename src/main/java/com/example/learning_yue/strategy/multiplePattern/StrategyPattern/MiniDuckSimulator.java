package com.design.pattern.strategy.multiplePattern.StrategyPattern;

/**
 * @author yueyz
 * @date 2021-12-05-19:00
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        //MallardDuck mall = new MallardDuck();
        //mall.performQuack();
        //mall.perFormFly();
        ModelDuck duck = new ModelDuck();
        /**
         * 第一次调用performFly 会被委托给FlyBehavior对象也就是FlyNowWay实例 该对象是在模型鸭构造器中实现的
         */
        duck.perFormFly();
        /**
         * 这会调用继承来的setter方法，把火箭动力的行为设定到魔性鸭中，哇，模型鸭突然具有了火箭动力飞行能力
         */
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.perFormFly();
        duck.perDuckCall();
        /**
         * 意味着模型鸭可以动态的改变他的飞行行为，如果把飞行行为的实现绑死在鸭子类中可能就无法做到这样了
         * 在运行中想改变鸭子的行为，只需要调用鸭子的setter方法就可以
         */
        /**
         * c策略模式定义了算法族 分别封装起来，让他们之间可以相互替换，此模式让算法族的变化独立于使用算法的客户
         */
    }
}
