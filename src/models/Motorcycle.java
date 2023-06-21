package models;

public class Motorcycle extends Vehicle{
    @Override
    public int getNumbersOfTires() {
        return super.numbersOfTires;
    }

    public Motorcycle(int speed ){
        this.speed=speed;
        this.numbersOfTires = 2;
    }
}
