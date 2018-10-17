package com.pryjda.observer_pattern.app.observers;

public class AppViewerOne implements Observer {

    private float temperature;
    private float humidity;
    private float pressure;

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        displayApplication();
    }

    public void displayApplication() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "AppViewerOne{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
