package com.design.pattern.strategy.multiplePattern.observerPattern.UpdateOberver;


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
        weatherData.setMeasurements(82, 70, 29.2F);
        weatherData.setMeasurements(78, 90, 29.4F);
        /**
         * 1、观察者定义了对象一对多的关系
         * 2、主题（也就是可观察者）用一个共同的接口来更新观察者
         * 3、观察者和可观察着之间用松耦合方式结合（咯哦色凑皮、ing）可观察者不知道观察者的细节只知道观察者实现了可观察者的接口
         * 4、使用此模式时，你可以从被观察者处推（push），或者拉（pull）推的方法被认为正确
         * 5、有多个特定的观察者时，不可以以来特定的通知顺序
         * 6、java有多中观察者模式的实现包括了通用的java.util.Observable
         * 7、要注意java.util.Observable实现上带来的一些问题
         * 8、如果有必要可以实现自己的Observable
         *
         *  在观察者模式中，会改变的时主题的状态，以及观察者的数目和类型，用这个模式，你可以改变依赖于主题状态的对象，却不必改变主题，这就叫提前规划。
         *  主题于观察者都使用接口，观察者利用主题的接口向主题注册，而主题利用观察者接口通知观察者，这样可以让二者之间运作正常，又同时具有松耦合性。
         *  观察者模式利用组合，将许多观察者组合进主题中，对象之间的这种关系不是通过继承产生的，而是通过运行时利用组合的方式而产生的。
         */
    }
}
