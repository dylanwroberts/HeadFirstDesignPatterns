package me.dylanroberts.headfirstdesignpatterns.observerpattern;

public class WeatherRunner {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions(weatherData);

        //simulating changes to the weather data
        weatherData.setMeasurements(80, 35);
        weatherData.setMeasurements(76, 42);
        weatherData.setMeasurements(66, 44);
        weatherData.setMeasurements(88, 30);
    }
}
