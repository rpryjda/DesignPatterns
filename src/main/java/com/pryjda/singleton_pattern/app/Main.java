package com.pryjda.singleton_pattern.app;

public class Main {
    public static void main(String[] args) {
        ConfigHelper configHelper = ConfigHelper.getConfig();
        configHelper.getProperties().forEach((x, y) -> System.out.println("key: " + x + " | value: " + y));
        System.out.println();

        Player player = new Player();
        player.load("log.tag");
        player.play();
        player.pause();
        player.play();
        player.stop();
        player.reset();
        player.play();

    }
}
