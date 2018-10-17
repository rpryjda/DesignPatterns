package com.pryjda.strategy_pattern.app.fly_strategies;

public class FlyStrategyFirst implements IFlyStrategy {

    @Override
    public void fly() {

        System.out.println("I'm flying slow");
    }
}
