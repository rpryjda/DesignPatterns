package com.pryjda.strategy_pattern.app;

import com.pryjda.strategy_pattern.app.fly_strategies.IFlyStrategy;

public class WildDuck extends Duck {

    public WildDuck(IFlyStrategy strategy) {

        super.setStrategy(strategy);
    }

    @Override
    public void display() {

        System.out.println("I'm WildDuck");
    }
}
