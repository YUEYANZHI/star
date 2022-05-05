package com.design.pattern.strategy.multiplePattern.decoratePattern;

/**
 * @author Yue YanZhi
 * @description TODO
 * @date 2022-04-29 10:16
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    public  String getDescription(){
        return description;
    };
    public abstract double cost();

    /**
     * 双倍摩卡豆浆奶泡拿铁咖啡
     * 1、首先调用最外围装饰着Whip的cost（）
     * 2、whip调用mocha的cost（）
     * 3、Mocha调用DarkRoast的cost()
     * 4、DarkRoast返回价钱0.99$
     * 5、Mocha在DarkRoast返回的假期拿上再加上自己的¥0.20$ 返回新的价钱1。19¥
     * 6、whip在Mocha返回的基础上再加上自己的¥0.10价钱返回最后的价钱¥1.29
     */
}
