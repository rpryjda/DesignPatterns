package com.pryjda.prototype_pattern.app;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Car car = new Car("Mercedes", 250, LocalDate.of(2005, 12, 12),
                Arrays.asList("SteeringWheel", "Seats"), "Navitel", 1.13F);

        Car car2 = car.clone();
        car2.setProductionDate(LocalDate.of(2011, 9, 9));

        System.out.println(car);
        System.out.println(car2);

    }
}
