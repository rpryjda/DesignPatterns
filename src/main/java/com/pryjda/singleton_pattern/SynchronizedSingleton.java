package com.pryjda.singleton_pattern;

import lombok.Getter;
import lombok.Setter;

public class SynchronizedSingleton {

    private static SynchronizedSingleton singleton;

    @Getter
    @Setter
    private int checkNumber;

    private SynchronizedSingleton() {
    }

    public static synchronized SynchronizedSingleton getInstance() {

        if (singleton == null) {
            singleton = new SynchronizedSingleton();
        }
        return singleton;
    }


}
