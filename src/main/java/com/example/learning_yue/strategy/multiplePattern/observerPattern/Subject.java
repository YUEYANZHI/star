package com.design.pattern.strategy.multiplePattern.observerPattern;

/**
 * @author Yue YanZhi
 * @description TODO
 * @date 2022-04-27 10:18
 * 主题接口
 */
public interface Subject {
    //以下时被用来注册或者删除
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    //主题状态改变时，这个方法会被调用通知所有观察者
    public void notifyObservers();
}
