import java.util.Scanner;



public class Account {
    private double balance;
    private double previousTransaction;
    String customerID;
    String customerName;

    Account(String cName, String cID){
        customerName = cName;
        customerID = cID;
    }

    void deposit(double amount){ // Here I am creating the deposit method.
        if (amount > 0){   // Setting this to greater than 0 because you can't deposit a negative number or 0.
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
    void withdraw(double amount){ // Here I am creating the withdrawal method.
        if (amount > 0){  // Also setting this to greater than 0 because you can't withdraw negative numbers.
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }
    void getPreviousTransaction(){
        if (previousTransaction > 0){
            System.out.println("Deposited: $" + previousTransaction);
        }
        else if (previousTransaction < 0){
            System.out.println("Withdrew: $" + Math.abs(previousTransaction));// Used absolute value because you can't withdraw a negative number.
        }
        else{
            System.out.println("No transaction took place.");
        }
    }
    public double getBalance(){
        return balance;
    }
    void displayMenu(){
        char option='\0';
        Scanner scanner = new Scanner(System.in);// Created scanner to read user inputs.

        System.out.println("Hello "+ customerName);
        System.out.println("Your identification number is "+ customerID); //This will make the console print out instructions for the user to follow.
        System.out.println("\n");
        System.out.println("A. Get Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous transactions");
        System.out.println("E. Exit");

        do {
            System.out.println("===================================================================");
            System.out.println("Select an option");
            System.out.println("===================================================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option){          // Switch case in do while loop so that each option could be run depending on what option the user selects.
                case 'E':
                    System.out.println("........................................");
                    break;

                default: System.out.println("Invalid option selected. Please select a value A-E");
                break;

                case 'D':
                    System.out.println("--------------------------------------");
                    getPreviousTransaction();
                    System.out.println("---------------------------------------");
                    break;

                case 'C':
                    System.out.println("-------------------------------------");
                    System.out.println("How much would you like to withdraw?");
                    System.out.println("-------------------------------------");
                    double amount2 = scanner.nextDouble();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("-------------------------------------");
                    System.out.println("How much would you like to deposit?");
                    System.out.println("-------------------------------------");
                    double amount = scanner.nextDouble();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'A':
                    System.out.println("-------------------------------------");
                    System.out.println(" Your balance is $"+ balance);
                    System.out.println("-------------------------------------");
                    System.out.println("\n");
                    break;
            }
        }while(option != 'E');
        System.out.println("Thanks for being a valued customer at Revature Bank");
    }


    public static void main(String[] args) {
        Account obj1 = new Account("Halim","HA123"); //created an example account and customerID.
        obj1.displayMenu();

    }
}
