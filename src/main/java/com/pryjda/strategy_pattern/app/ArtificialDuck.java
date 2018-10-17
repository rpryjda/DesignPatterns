package com.pryjda.strategy_pattern.app;

import com.pryjda.strategy_pattern.app.fly_strategies.FlyStrategyFirst;


public class ArtificialDuck extends Duck {

    public ArtificialDuck() {
        super.setStrategy(new FlyStrategyFirst());
    }

    @Override
    public void display() {

        System.out.println("I'm ArtificialDuck");
    }
}
