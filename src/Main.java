import models.Car;

public class Main {
    public static void main(String[] args) {

        Car a = new Car(
                "prova",
                "ITS",
                2023
        );

        System.out.println(a.getModel());
        System.out.println(a.getManufactures());
        System.out.println(a.getYear());

        a.setModel("500");
        a.setManufactures("Fiat");
        a.setYear(2019);

        System.out.println(a.toString());

    }
}