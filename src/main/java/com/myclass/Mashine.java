package com.myclass.impliments;

import com.myclass.interfaces.Run;

/**
 * Created by Rekdon on 19.05.2017.
 */

public abstract class Mashine implements Run {
    public final int MAX_SPEED = 300;
    public final int MIN_SPEED = 0;
    public final int MIN_NUMBER_OF_PASSENGERS = 1;
    public final int MAX_NUMBER_OF_PASSENGERS_IN_PLANE = 50;
    public final int MAX_NUMBER_OF_PASSENGERS_IN_BUS = 30;
    private String name;
    private int speedNow;

    public Mashine(String name, int speedNow) {
        this.name = name;
        this.speedNow = speedNow;
    }

    public String outputName(String name) {
        return name;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speedNow;
    }
}
