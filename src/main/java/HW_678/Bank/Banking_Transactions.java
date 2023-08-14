package HW_678.Bank;

import java.util.Scanner;

class Banking_Transactions {

    private String accountNumber;
    private int balance;

    Banking_Transactions(){
    }

    Banking_Transactions(String accNum, int bal){
       accountNumber = accNum;
       balance = bal;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    int getBalance(){
        return balance;
    }

    void deposit(int amount){
        if (amount != 0){
            balance += amount;
        }
    }

    void withdraw(int amount){
        if (amount != 0 && amount < balance && balance !=0){
            balance -= amount;

        } else {
            System.out.println("Sorry, but you don't have enough funds in your account!\nYou can only withdraw " + balance + " $ from your account.");
        }
    }
    void showMenu(){
        char option;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome " + getAccountNumber());
        System.out.println();
        System.out.println("A. Check balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("E. Exit");

        do {
            System.out.println("=======================================");
            System.out.println("Enter the option: ");
            System.out.println("=======================================");
            option = input.next().charAt(0);

            switch (option){
                case 'A':
                    System.out.println("=======================================");
                    System.out.println("Balance is: " + getBalance() + " $");
                    System.out.println("=======================================");
                    System.out.println();
                    break;
                case 'B' :
                    System.out.println("=======================================");
                    System.out.println("Enter the amount to deposit");
                    System.out.println("=======================================");
                    int amount = input.nextInt();
                    deposit(amount);
                    System.out.println(amount + " $ credited to your account.\n" +
                            "Your balance is: " + getBalance() + " $.");
                    break;
                case 'C' :
                    System.out.println("=======================================");
                    System.out.println("Enter the amount to withdraw");
                    System.out.println("=======================================");
                    int amount2 = input.nextInt();
                    withdraw(amount2);
                    System.out.println("Now your balance is: " + getBalance() + " $.");
                    System.out.println();
                    break;
                case 'E' :
                    System.out.println("=======================================");
                    break;
                default:
                    System.out.println("Invalid Option! Try again.");
                    break;
            }

        } while (option != 'E');



    }


}
