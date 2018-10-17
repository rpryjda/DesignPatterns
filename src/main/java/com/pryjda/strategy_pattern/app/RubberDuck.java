package com.pryjda.strategy_pattern.app;

import com.pryjda.strategy_pattern.app.fly_strategies.IFlyStrategy;

public class RubberDuck extends Duck {

    public RubberDuck(IFlyStrategy strategy) {

        super.setStrategy(strategy);
    }

    @Override
    public void display() {

        System.out.println("I'm RubberDuck");
    }
}
