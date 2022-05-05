package com.design.pattern.strategy.multiplePattern.decoratePattern;

/**
 * @author Yue YanZhi
 * @description TODO
 * @date 2022-04-29 17:12
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        //定一杯Espresso 不需要调料，打印出他的描述与价钱
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+"$"+beverage.cost());

    }


}
