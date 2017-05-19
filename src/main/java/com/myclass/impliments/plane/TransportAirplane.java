package com.myclass.impliments.plane;

/**
 * Created by Rekdon on 19.05.2017.
 */

public class TransportAirplane extends Plane {
    private int maxLoadingCapacity;
    private int weightGoods;


    public TransportAirplane(String name, int speedNow, int id, int mass, int numberOfPassengers, int numberOfWheels, int numberOfPilots, int maxLoadingCapacity, int weightGoods) {
        super(name, speedNow, id, mass, numberOfPassengers, numberOfWheels, numberOfPilots);
        this.maxLoadingCapacity = maxLoadingCapacity;
        this.weightGoods = weightGoods;
    }

    public int getMaxLoadingCapacity() {
        return maxLoadingCapacity;
    }

    public int getWeightGoods() {
        return weightGoods;
    }

    public String getMaxMass(int mass) {
        int max = mass + getWeightGoods();
        if (max > maxLoadingCapacity) {
            return "Літак перегружено,потрібно зменшити вагу літака";
        } else
            return "Вага літака не перевищує його максимальної вантажності,до польоту говоий!";
    }

    public double getMinSpeed(int speed, int numberOfPassengers) {
        return speed - ((numberOfPassengers * 0.5) + (getWeightGoods() * 0.01));
    }

    @Override
    public String toString() {
        return "          Інформація про літак         " + "\n" +
                "Транспортний літак " + "\n" +
                "Назва літака : " + getName() + "\n" +
                "загальна вага літака : " + getMass() + "\n" +
                "кількість пасажирів : " + getNumberOfPassengers() + "\n" +
                "кількість коліс : " + getNumberOfWheels() + "\n" +
                "кількість пілотів : " + getNumberOfPilots() + "\n" +
                "вага товару : " + getWeightGoods() + "\n" +
                "максимальна вантажність літака : " + getMaxLoadingCapacity() + "\n" +
                "мінімальна швидкість : " + getMinSpeed(getSpeed(), getNumberOfPassengers()) + "\n" +
                "максимальна швидкість : " + (getSpeed() - 70 * 0.5) + "\n" +
                "Обробляється інформація чи літак може злетіти : " + "\n" + "***********************" + "\n" +
                checkPassengers(getNumberOfPassengers(), getNumberOfPilots()) + "\n" +
                getMaxMass(getMass());


    }
}

