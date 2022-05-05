package com.design.pattern.strategy.multiplePattern.observerPattern.UpdateOberver;

import java.util.Observable;

/**
 * @author Yue YanZhi
 * @description TODO
 * @date 2022-04-27 10:32
 * 我们把注册与删除交给继承的超类管理
 */
public class WeatherData  extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 注意我们没有调用notifyObservers传送数据对象，者表示我们采用的做法时拉
     */

    //我们的构造器不再需要为了记住观察者们而建立数据结构
    public WeatherData() {
    }

    /**
     * 以下三个get方法并不是新方法，只是因为我们要采取拉的做法，所以才提醒你有这些方法，观察者会利用这些方法获取WeatherData对象的状态
     * @return
     */
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    //当从气象站得到更新观测时我们，通知观察者
    public void measurementsChanged(){
        //在调用notifyObservers之前，要先调用serChange来指示状态已改变
        if (this.pressure > 20){
            setChanged();
        }
        notifyObservers();
    }

    public  void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
