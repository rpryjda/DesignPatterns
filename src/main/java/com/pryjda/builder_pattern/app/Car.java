package com.pryjda.builder_pattern.app;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@ToString
public class Car {

    private String name;
    private Integer vmax;
    private LocalDate productionDate;
    private List<String> leatherElements;
    private String navigationProvider;
    private Float bluetoothVersion;

    private Car(String name, Integer vmax, LocalDate productionDate, List<String> leatherElements, String navigationProvider, Float bluetoothVersion) {
        this.name = name;
        this.vmax = vmax;
        this.productionDate = productionDate;
        this.leatherElements = leatherElements;
        this.navigationProvider = navigationProvider;
        this.bluetoothVersion = bluetoothVersion;
    }

    public static class CarBuilder {

        private String name;
        private Integer vmax;
        private LocalDate productionDate;
        private List<String> leatherElements;
        private String navigationProvider;
        private Float bluetoothVersion;

        public CarBuilder() {
        }

        public Car build() {
            return new Car(name, vmax, productionDate, leatherElements, navigationProvider, bluetoothVersion);
        }

        public CarBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder withVmax(Integer vmax) {
            this.vmax = vmax;
            return this;
        }

        public CarBuilder withProductionDate(LocalDate productionDate) {
            this.productionDate = productionDate;
            return this;
        }

        public CarBuilder withLeatherElements(List<String> leatherElements) {
            this.leatherElements = leatherElements;
            return this;
        }

        public CarBuilder withNavigationProvider(String navigationProvider) {
            this.navigationProvider = navigationProvider;
            return this;
        }

        public CarBuilder withBluetoothVersion(Float bluetoothVersion) {
            this.bluetoothVersion = bluetoothVersion;
            return this;
        }

    }

}
