package com.myclass.impliments.plane;

/**
 * Created by Rekdon on 19.05.2017.
 */
public class Airlaner extends Plane {
    private int numberOfStewardess;


    public Airlaner(String name, int speedNow, int id, int mass, int numberOfPassengers, int numberOfWheels, int numberOfPilots, int numberOfStewardess) {
        super(name, speedNow, id, mass, numberOfPassengers, numberOfWheels, numberOfPilots);
        this.numberOfStewardess = numberOfStewardess;
    }

    public int getNumberOfStewardess() {
        return numberOfStewardess;
    }

    public int getMaxMass(int mass) {
        return mass + getNumberOfPassengers() * 65 + numberOfStewardess * 55;
    }

    public double getMinSpeed(int speed, int numberOfPassengers) {
        return speed - ((numberOfPassengers * 0.5) + (numberOfStewardess * 0.4));
    }

    @Override
    public String toString() {
        return "          Інформація про літак         " + "\n" +
                "Пасажирський літак " + "\n" +
                "Назва літака : " + getName() + "\n" +
                "загальна вага літака : " + getMass() + "\n" +
                "кількість пасажирів : " + getNumberOfPassengers() + "\n" +
                "кількість коліс : " + getNumberOfWheels() + "\n" +
                "кількість пілотів : " + getNumberOfPilots() + "\n" +
                "кількість стьюардес : " + getNumberOfStewardess() + "\n" +
                "мінімальна швидкість : " + getMinSpeed(getSpeed(), getNumberOfPassengers()) + "\n" +
                "максимальна швидкість : " + (getSpeed() - 70 * 0.5) + "\n" +
                "максимальна вага : " + getMaxMass(getMass()) + "\n" +
                checkPassengers(getNumberOfPassengers(), getNumberOfPilots());
    }
}
