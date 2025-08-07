package bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n1.Create new account 2.Open existing account 3.Check Balance 4.Display richest person in the bank 5.exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    bank.create();
                    break;
                case 2:
                    bank.exac();
                    break;
                case 3:
                    bank.checkBalance();
                    break;
                case 4:
                    bank.showRichest();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}