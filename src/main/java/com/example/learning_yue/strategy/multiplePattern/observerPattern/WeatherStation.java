package com.design.pattern.strategy.multiplePattern.observerPattern;

/**
 * @author Yue YanZhi
 * @description TODO
 * @date 2022-04-27 10:53
 */
public class WeatherStation {
    public static void main(String[] args) {
        //首先建立一个WeatherData对象
        WeatherData weatherData = new WeatherData();
        //建立三个布告者并把WeatherData传给他们
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        //StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4F);
        weatherData.setMeasurements(82,70,29.2F);
        weatherData.setMeasurements(78,90,29.4F);

    }
}
