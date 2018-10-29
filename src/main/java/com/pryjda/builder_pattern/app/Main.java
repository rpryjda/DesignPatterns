package com.pryjda.builder_pattern.app;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car car = new Car.CarBuilder()
                .withName("Mercedes")
                .withVmax(250)
                .withProductionDate(LocalDate.of(2005, 12, 12))
                .withBluetoothVersion(1.13F)
                .withNavigationProvider("Navitel")
                .withLeatherElements(Arrays.asList("SteeringWheel", "Seats"))
                .build();

        System.out.println(car);

        Car car2 = new Car.CarBuilder()
                .withName("Fiat")
                .withVmax(230)
                .withProductionDate(LocalDate.of(2010, 12, 12))
                .build();

        System.out.println(car2);

    }
}
