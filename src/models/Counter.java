package models;

public class Counter {

    public static int count = 0;
    public int number;

    public Counter(int number) {
        this.number = number;
    }

    public static void incrementCount(int n) {
        count += n;
    }

    public static int getCount() {
        return count;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
