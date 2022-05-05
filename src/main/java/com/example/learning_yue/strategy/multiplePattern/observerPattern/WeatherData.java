package com.design.pattern.strategy.multiplePattern.observerPattern;

import java.util.ArrayList;

/**
 * @author Yue YanZhi
 * @description TODO
 * @date 2022-04-27 10:32
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }
    //当注册观察者时，我们只要把它加入到ArrayList中即可
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    //同样的，当观察者想取消注册我们把它从ArrayList删除即可
    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(observer);
        }

    }

    //在这里我们把状态告诉每一个观察者，因为观察者都实现了update（）所以我们知道如何通知他们
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
          Observer observer= (Observer) observers.get(i);
          observer.update(temperature,humidity,pressure);
        }
    }
    //当从气象站得到更新观测时我们，通知观察者
    public void measurementsChanged(){
        notifyObservers();
    }

    public  void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
