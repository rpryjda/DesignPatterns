package com.pryjda.singleton_pattern.app;

public class Player {

    private boolean isLoad = false;
    private String configTag;
    private ConfigHelper configHelper = ConfigHelper.getConfig();

    public void play() {
        if (isLoad) {
            System.out.println("it has started: " + configTag);
        }
    }

    public void pause() {
        if (isLoad) {
            System.out.println("it has paused: " + configTag);
        }
    }

    public void stop() {
        if (isLoad) {
            System.out.println("it has stopped: " + configTag);
        }
    }

    public void load(String configTag) {
        this.configTag = configHelper.getProperties().get(configTag);
        System.out.println("it has loaded: " + this.configTag);
        isLoad = true;
    }

    public void reset() {
        isLoad = false;
    }


}
