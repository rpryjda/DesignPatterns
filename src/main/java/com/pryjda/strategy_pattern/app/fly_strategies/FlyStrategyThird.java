package com.pryjda.strategy_pattern.app.fly_strategies;

public class FlyStrategyThird implements IFlyStrategy {

    @Override
    public void fly() {

        System.out.println("I can't fly at all");
    }
}
