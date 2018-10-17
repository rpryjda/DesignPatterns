package com.pryjda.strategy_pattern.app2;

import com.pryjda.strategy_pattern.app2.tax_strategies.PLTax;
import com.pryjda.strategy_pattern.app2.tax_strategies.ITaxStrategy;
import com.pryjda.strategy_pattern.app2.tax_strategies.USATax;

import java.util.HashMap;
import java.util.Map;

public class TaxManager {

   private Map<String, ITaxStrategy> countryStrategiesByCodes;

    public TaxManager() {
        countryStrategiesByCodes = new HashMap<>();
        countryStrategiesByCodes.put("0012", new USATax());
        countryStrategiesByCodes.put("0048", new PLTax());
    }


    private ITaxStrategy getStrategy(String countryCode) {

        return countryStrategiesByCodes.get(countryCode);

    }

    public Float calculateTax(String countryCode, Float income){
        return getStrategy(countryCode).calculateTax(income);
    }

}
