package com.pryjda.observer_pattern.app;

import com.pryjda.observer_pattern.app.observers.Observer;

import java.util.ArrayList;
import java.util.Random;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
        observers = new ArrayList<>();
    }

    private float readTemperature() {
        return new Random().nextInt(40);
    }

    private float readHumidity() {
        return new Random().nextInt(100);
    }

    private float readPressure() {
        return new Random().nextInt(20) + 1000;
    }

    void setNewMeasurements() {
        temperature = this.readTemperature();
        humidity = this.readHumidity();
        pressure = this.readPressure();
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
