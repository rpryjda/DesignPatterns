package com.pryjda.strategy_pattern.app2.tax_strategies;

public class USATax implements ITaxStrategy {

    @Override
    public Float calculateTax(Float income) {

        return 0.4F*income;
    }
}
