package models;

public class BankAccount {

    public static String bankName;
    int accountNumber;
    int balance;

    public BankAccount (int accountNumber, int balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public static String setBankName(String name) {
        BankAccount.bankName = name;
        return name;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("No Credits, give me Money");
        }
    }

    public void getAccountInfo() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

}
