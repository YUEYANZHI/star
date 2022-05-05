package com.design.pattern.strategy.multiplePattern.observerPattern.UpdateOberver;


import java.util.Observable;
import java.util.Observer;

/**
 * @author Yue YanZhi
 * @description TODO
 * @date 2022-04-27 10:43
 * 此布告板实现了Observer接口，所以可以从WeatherData对象中获取改变
 * 他也实现了DisplayElement因为我们的API规定了所有的布告板都必须实现此接口
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        //display()方法就只是把最近的温度和湿度显示出来
        System.out.println("Current conditions " + temperature + "F degrees and" + humidity + "%humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity =weatherData.getHumidity();
            display();
        }
    }
}
