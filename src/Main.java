import models.Car;
import models.Motorcycle;
import models.Vehicle;

public class Main {
    public static void main(String[] args) {

        Motorcycle Vespa = new Motorcycle(
                50
        );

        Car Panda = new Car(
                75
        );

        System.out.println("La velocità della Vespa è :"+Vespa.getSpeed());
        System.out.println("La velocità della Panda è :"+Panda.getSpeed());

        System.out.println("La Vespa ha :"+Vespa.getNumbersOfTires()+ " ruote");
        System.out.println("La Panda ha :"+Panda.getNumbersOfTires()+ " ruote");

    }
}