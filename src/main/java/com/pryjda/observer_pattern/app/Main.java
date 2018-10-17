package com.pryjda.observer_pattern.app;

import com.pryjda.observer_pattern.app.observers.AppViewerOne;
import com.pryjda.observer_pattern.app.observers.AppViewerThree;
import com.pryjda.observer_pattern.app.observers.AppViewerTwo;
import com.pryjda.observer_pattern.app.observers.Observer;

public class Main {

    public static void main(String[] args) {

        WeatherData data = new WeatherData();

        Observer firstObserver = new AppViewerOne();
        Observer secondObserver = new AppViewerTwo();
        Observer thirdObserver = new AppViewerThree();

        data.registerObserver(firstObserver);
        data.registerObserver(secondObserver);
        data.registerObserver(thirdObserver);

        data.setNewMeasurements();
        System.out.println();

        data.setNewMeasurements();
        System.out.println();

        data.setNewMeasurements();
        System.out.println();

        data.removeObserver(firstObserver);
        data.setNewMeasurements();

    }

}
