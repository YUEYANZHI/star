package com.design.pattern.strategy.multiplePattern.decoratePattern;

/**
 * @author Yue YanZhi
 * @description TODO
 * @date 2022-04-29 10:05
 */
public abstract class CondimentDecorator extends Beverage{
    //首先必修让Condiment Description 能够取代Beverage 所以将CondimentDescription扩展自Beverage
    //所有的🧂装饰着都必须重新实现setDescription（）
   public abstract String getDescription();
}
