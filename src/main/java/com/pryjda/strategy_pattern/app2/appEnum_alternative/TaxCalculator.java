package com.pryjda.strategy_pattern.app2.appEnum_alternative;

public enum TaxCalculator {

    PL {
        public Float calculate(Float income) {
            if (income > 85000) {
                return 0.35F * income;
            }
            return 0.19F * income;
        }
    },
    USA {
        public Float calculate(Float income) {
            return 0.4F * income;
        }
    };

    public abstract Float calculate(Float income);

}
