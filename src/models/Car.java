package models;


public class Car {

    private String model;
    protected  String manufactures;
    public int year;


    public Car(String model, String manufactures, int year){
        this.model=model;
        this.manufactures=manufactures;
        this.year= year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufactures() {
        return manufactures;
    }

    public void setManufactures(String manufactures) {
        this.manufactures = manufactures;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
