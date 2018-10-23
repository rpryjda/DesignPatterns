package com.pryjda.singleton_pattern.app;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ConfigHelper {

    private static ConfigHelper config = new ConfigHelper();
    @Getter
    @Setter
    private Map<String, String> properties;

    private ConfigHelper() {

        Path path = Paths.get("src\\main\\resources\\properties.txt");
        properties = new HashMap<>();
        try {
            Files.lines(path)
                    .forEach(x -> {
                        String[] devidedProperties = x.split("=");
                        properties.put(devidedProperties[0], devidedProperties[1]);
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ConfigHelper getConfig() {
        return config;
    }


}
