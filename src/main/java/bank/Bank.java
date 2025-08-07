package bank;

import java.util.*;

public class Bank {
    private Scanner s = new Scanner(System.in);
    private Map<Integer, Account> accounts = new HashMap<>();
    private int nextAccNo = 1;

    public void create() {
        System.out.print("Enter your name: ");
        s.nextLine(); 
        String name = s.nextLine();

        System.out.print("Enter your address: ");
        String address = s.nextLine();

        Account account = new Account(name, address);
        accounts.put(nextAccNo, account);

        System.out.println("Your account number is: " + nextAccNo);
        System.out.println("Your account has been created");

        nextAccNo++;
    }

    public void exac() {
        while (true) {
            System.out.println("1.Deposit 2.Withdraw 3.Transfer 4.Balance 5.exit");
            System.out.print("Enter your choice: ");
            int ch = s.nextInt();

            switch (ch) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    transfer();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private void deposit() {
        System.out.print("Enter account number: ");
        int acc = s.nextInt();
        if (accounts.containsKey(acc)) {
            System.out.print("Enter amount to deposit: ");
            double amt = s.nextDouble();
            accounts.get(acc).deposit(amt);
            System.out.printf("Amount %.2f deposited successfully%n", amt);
        } else {
            System.out.println("Invalid account number!");
        }
    }

    private void withdraw() {
        System.out.print("Enter account number: ");
        int acc = s.nextInt();
        if (accounts.containsKey(acc)) {
            System.out.print("Enter amount to withdraw: ");
            double amt = s.nextDouble();
            if (accounts.get(acc).withdraw(amt)) {
                System.out.println("Withdrawal successful");
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Invalid account number!");
        }
    }

    private void transfer() {
        System.out.print("Enter your account number: ");
        int from = s.nextInt();
        if (!accounts.containsKey(from)) {
            System.out.println("Invalid sender account.");
            return;
        }

        System.out.print("Enter amount to transfer: ");
        double amt = s.nextDouble();

        System.out.print("Enter recipient account number: ");
        int to = s.nextInt();
        if (!accounts.containsKey(to)) {
            System.out.println("Invalid recipient account.");
            return;
        }

        if (accounts.get(from).withdraw(amt)) {
            accounts.get(to).deposit(amt);
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void checkBalance() {
        System.out.print("Enter account number: ");
        int acc = s.nextInt();
        if (accounts.containsKey(acc)) {
            System.out.printf("Current balance: %.2f%n", accounts.get(acc).getBalance());
        } else {
            System.out.println("Invalid account number!");
        }
    }

    public void showRichest() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts exist.");
            return;
        }

        int richestAcc = -1;
        double maxBalance = -1;

        for (Map.Entry<Integer, Account> entry : accounts.entrySet()) {
            if (entry.getValue().getBalance() > maxBalance) {
                richestAcc = entry.getKey();
                maxBalance = entry.getValue().getBalance();
            }
        }

        Account rich = accounts.get(richestAcc);
        System.out.println("The richest person is: " + rich.getName());
        System.out.printf("Their balance is: %.2f%n", rich.getBalance());
    }
}
