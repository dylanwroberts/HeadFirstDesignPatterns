package me.dylanroberts.headfirstdesignpatterns.observerpattern;

public class CurrentConditions implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentConditions(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this);
    }

    @Override
    public void update(float temp, float humidity) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("current temp: " + this.temp + "\n" +
                "current humidity: " + this.humidity + "\n");
    }
}
