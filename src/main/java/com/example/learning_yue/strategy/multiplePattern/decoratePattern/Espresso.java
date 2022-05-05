package com.design.pattern.strategy.multiplePattern.decoratePattern;

/**
 * @author Yue YanZhi
 * @description TODO
 * @date 2022-04-29 10:27
 * 首先让Espresso扩展Beverage类，因为Espresso是一种饮料
 */
public class Espresso extends Beverage {
    //为了要设置饮料的描述我们写了一个构造器记住description实例变量继承自Beverage
    public Espresso(){
        description = "Espresso";
    }

    //最后，需要计算Espresso的价钱，现在不需要管调料的价钱，直接把Espresso的价钱1.99返回即可
    @Override
    public double cost() {
        return 1.99;
    }
}
