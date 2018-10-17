package com.pryjda.observer_pattern.app;

import com.pryjda.observer_pattern.app.observers.Observer;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();


}
