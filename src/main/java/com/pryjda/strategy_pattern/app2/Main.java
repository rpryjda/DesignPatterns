package com.pryjda.strategy_pattern.app2;

import com.pryjda.strategy_pattern.app2.appEnum_alternative.TaxCalculator;

public class Main {

    public static void main(String[] args) {

        TaxManager taxManager = new TaxManager();

        float tax = taxManager.calculateTax("0048",100000F);
        System.out.println(tax);

        float tax2 = taxManager.calculateTax("0012",100000F);
        System.out.println(tax2);

        //from enum (ALTERNATIVE FOR THE STRATEGY PATTERN):

        float tax3 = TaxCalculator.PL.calculate(100000F);
        System.out.println(tax3);

        float tax4 = TaxCalculator.USA.calculate(100000F);
        System.out.println(tax4);

    }
}
