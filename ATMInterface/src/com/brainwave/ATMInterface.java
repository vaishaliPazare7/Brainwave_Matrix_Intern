package com.brainwave;
import java.util.*;

public class ATMInterface {
	 public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				ATM myATM = new ATM(10000, 7447); // Initial balance: $10000, PIN: 7447

				System.out.print("Enter your PIN: ");
				int enteredPin = scanner.nextInt();

				if (!myATM.authenticate(enteredPin)) {
				    System.out.println("Incorrect PIN. Exiting...");
				    return;
				}

				while (true) {
				    System.out.println("\n=== ATM Menu ===");
				    System.out.println("1. Check Balance");
				    System.out.println("2. Withdraw Money");
				    System.out.println("3. Deposit Money");
				    System.out.println("4. Exit");
				    System.out.print("Choose an option: ");

				    int choice = scanner.nextInt();
				    switch (choice) {
				        case 1:
				            myATM.checkBalance();
				            break;
				        case 2:
				            System.out.print("Enter amount to withdraw: ");
				            double withdrawAmount = scanner.nextDouble();
				            myATM.withdraw(withdrawAmount);
				            break;
				        case 3:
				            System.out.print("Enter amount to deposit: ");
				            double depositAmount = scanner.nextDouble();
				            myATM.deposit(depositAmount);
				            break;
				        case 4:
				            System.out.println("Thank you for using the ATM. Goodbye!");
				            return;
				        default:
				            System.out.println("Invalid choice. Please try again.");
				    }
				}
			}
	    }

}
