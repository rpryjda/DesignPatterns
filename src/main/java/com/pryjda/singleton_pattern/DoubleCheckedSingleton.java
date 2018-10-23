package com.pryjda.singleton_pattern;

import lombok.Getter;
import lombok.Setter;

public class DoubleCheckedSingleton {

    private static volatile DoubleCheckedSingleton singleton;

    @Getter
    @Setter
    private int checkNumber;

    private DoubleCheckedSingleton() {
    }

    public static DoubleCheckedSingleton getInstance() {

        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckedSingleton();
                }
            }
        }
        return singleton;
    }

}
