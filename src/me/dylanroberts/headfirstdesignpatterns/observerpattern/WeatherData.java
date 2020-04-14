package me.dylanroberts.headfirstdesignpatterns.observerpattern;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temp = 75;
    private float humidity = 34;

    public WeatherData() { observers = new ArrayList<>(); }

    @Override
    public void register(Observer o) { observers.add(o); }

    @Override
    public void remove(Observer o) { observers.remove(o); }

    @Override
    public void broadcast() {
        for(Observer o : this.observers) {
            o.update(this.temp, this.humidity);
        }
    }

    public void measurementsChanged() { broadcast(); }

    public void setMeasurements(float temp, float humidity) {
        this.temp = temp;
        this.humidity = humidity;
        measurementsChanged();
    }

    public float getHumidity() { return this.humidity; }

    public float getTemp() { return this.temp; }
}