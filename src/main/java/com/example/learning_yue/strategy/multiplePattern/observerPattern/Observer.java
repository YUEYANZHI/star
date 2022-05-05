package com.design.pattern.strategy.multiplePattern.observerPattern;

/**
 * @author Yue YanZhi
 * @description TODO
 * @date 2022-04-27 10:21
 */
public interface Observer {
    /**
     * 当气象观测值改变时，主题会把这些状态值当作方法的参数，传递给观察者
     * @param temp
     * @param humidity
     * @param pressure
     * 所有的观察者必须实现update方法，以实现观察者接口
     */
    public void update(float temp,float humidity,float pressure);
}
