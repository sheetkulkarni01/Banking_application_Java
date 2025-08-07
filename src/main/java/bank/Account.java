package bank;

public class Account {
    private String name;
    private String address;
    private double balance;

    public Account(String name, String address) {
        this.name = name;
        this.address = address;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}