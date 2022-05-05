package com.design.pattern.strategy.multiplePattern.observerPattern;

/**
 * @author Yue YanZhi
 * @description TODO
 * @date 2022-04-28 15:00
 */
public class StatisticsDisplay implements DisplayElement,Observer {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        //display()方法就只是把最近的温度和湿度显示出来
        System.out.println("Current conditions " + temperature + "F degrees and" + humidity + "%humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display(); //当update（）被调用时，我们把温度和湿度保存起来然后调用display（）；
    }
}
