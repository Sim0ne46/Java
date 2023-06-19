import models.Client;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Client a = new Client(
                "Giovanni",
                "Verdi",
                001,
                200,
                100,
                125
        );

        System.out.println(a);
        System.out.print("Saldo dopo Prelievo : ");
        System.out.println(a.prelievo());
        System.out.print("Saldo dopo Versamento : ");
        System.out.println(a.versamento());
        System.out.print("Saldo Bilanciato : ");
        System.out.println(a.bilancio());

    }
}