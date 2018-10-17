package com.pryjda.strategy_pattern.app;

import com.pryjda.strategy_pattern.app.fly_strategies.FlyStrategyFirst;
import com.pryjda.strategy_pattern.app.fly_strategies.FlyStrategySecond;
import com.pryjda.strategy_pattern.app.fly_strategies.FlyStrategyThird;

public class Main {

    public static void main(String[] args) {

        Duck wildDuck = new WildDuck(new FlyStrategyFirst());
        wildDuck.display();
        wildDuck.swim();
        wildDuck.fly();
        wildDuck.setStrategy(new FlyStrategySecond());
        wildDuck.fly();
        wildDuck.setStrategy(new FlyStrategyThird());
        wildDuck.fly();

        System.out.println();

        Duck artificialDuck = new ArtificialDuck();
        artificialDuck.display();
        artificialDuck.swim();
        artificialDuck.fly();
        artificialDuck.setStrategy(new FlyStrategySecond());
        artificialDuck.fly();
        artificialDuck.setStrategy(new FlyStrategyThird());
        artificialDuck.fly();

    }
}
