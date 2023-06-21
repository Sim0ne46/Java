package models;

public class Car extends Vehicle{
    @Override
    public int getNumbersOfTires() {
        return super.numbersOfTires;
    }

    public Car(int speed){
        this.speed=speed;
        this.numbersOfTires = 4;
    }
}
