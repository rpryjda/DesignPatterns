package com.pryjda.strategy_pattern.app;

import com.pryjda.strategy_pattern.app.fly_strategies.IFlyStrategy;

public abstract class Duck {

    private IFlyStrategy strategy;

    public abstract void display();

    public void swim() {

        System.out.println("I'm swimming");
    }

    public void fly() {

        strategy.fly();
    }

    public void setStrategy(IFlyStrategy strategy) {

        this.strategy = strategy;
    }

}
