package com.pryjda.strategy_pattern.app2.tax_strategies;

public class PLTax implements ITaxStrategy {

    @Override
    public Float calculateTax(Float income) {

        if(income>85000){
            return 0.35F*income;
        }
        return 0.19F*income;
    }
}
