package models;

public abstract class Vehicle {
    protected int speed;
    protected int numbersOfTires;

    public int getSpeed() {
        return speed;
    }

    public abstract int getNumbersOfTires();

}
