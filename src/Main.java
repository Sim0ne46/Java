import models.BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount.setBankName("No Money");

        BankAccount a = new BankAccount(
                001,
                100
        );

        BankAccount b = new BankAccount(
                002,
                570
        );


        a.deposit(100);
        b.withdraw(700);


        a.getAccountInfo();
        b.getAccountInfo();


        b.deposit(300);
        a.withdraw(50);

        a.getAccountInfo();
        b.getAccountInfo();

        BankAccount.setBankName("Now i have Money");

        BankAccount c = new BankAccount(
                003,
                10000
        );

        c.getAccountInfo();

    }
}