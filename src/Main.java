
import models.Classe;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Classe a = new Classe(
                "A",
                001,
                1,
                "Meccanica",
                "Pomilio",
                true
        );

        System.out.println(a);

        Classe b = new Classe(
                "B",
                002,
                2,
                "Informatica",
                "Pomilio",
                false
        );

        System.out.println(b);

    }
}
