import models.Counter;

public class Main {
    public static void main(String[] args) {

        Counter counter1 = new Counter(
                3);
        Counter counter2 = new Counter(
                22);


        System.out.println("Count: " + Counter.getCount());

        Counter.incrementCount(counter1.getNumber());
        System.out.println("Count dopo incremento con counter1: " + Counter.getCount());

        Counter.incrementCount(counter2.getNumber());
        System.out.println("Count dopo incremento con  counter2: " + Counter.getCount());

    }
}