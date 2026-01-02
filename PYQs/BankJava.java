/*
Problem Statement:
Write a Java program to implement method overloading for a Banking system.

Method 1:
void processTransaction(int amount, String type)
- If type is "Deposit", add amount to balance
- If type is "Withdraw", subtract amount from balance
- Use case-sensitive comparison

Method 2:
void processTransaction(int n)
- Print the last n transactions (n <= 10)

Use Scanner to read inputs and allow the user to choose operations.
*/

import java.util.Scanner;

class Bank {
    int balance = 0;
    int[] transactions = new int[10];
    int count = 0;

    // Overloaded Method 1: Deposit / Withdraw
    void processTransaction(int amount, String type) {
        if (type.equals("Deposit")) {
            balance += amount;
            transactions[count++] = amount;
            System.out.println("Deposited: " + amount);
        }
        else if (type.equals("Withdraw")) {
            balance -= amount;
            transactions[count++] = -amount;
            System.out.println("Withdrawn: " + amount);
        }
        else {
            System.out.println("Invalid transaction type");
        }
        System.out.println("Current Balance: " + balance);
    }

    // Overloaded Method 2: Display last n transactions
    void processTransaction(int n) {
        System.out.println("Last " + n + " transactions:");
        int start = Math.max(0, count - n);
        for (int i = start; i < count; i++) {
            System.out.println(transactions[i]);
        }
    }
}

public class BankJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        int choice;

        do {
            System.out.println("\n1. Deposit/Withdraw");
            System.out.println("2. Show last n transactions");
            System.out.println("3. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    int amt = sc.nextInt();
                    System.out.print("Enter type (Deposit/Withdraw): ");
                    String type = sc.next();
                    bank.processTransaction(amt, type);
                    break;

                case 2:
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    bank.processTransaction(n);
                    break;
            }
        } while (choice != 3);

        sc.close();
    }
}
