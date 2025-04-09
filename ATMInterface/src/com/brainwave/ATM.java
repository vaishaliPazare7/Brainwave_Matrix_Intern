package com.brainwave;
import java.util.Scanner;

@SuppressWarnings("unused")
public class ATM {
	  private int balance;
	    private int pin;

	    public ATM(int initialBalance, int pin) {
	        this.balance = initialBalance;
	        this.pin = pin;
	    }

	    public boolean authenticate(int enteredPin) {
	        return this.pin == enteredPin;
	    }

	    public void checkBalance() {
	        System.out.println("Your current balance is: $" + balance);
	    }

	    public void withdraw(double amount) {
	        if (amount > balance) {
	            System.out.println("Insufficient balance.");
	        } else if (amount <= 0) {
	            System.out.println("Invalid withdrawal amount.");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawal successful. New balance: $" + balance);
	        }
	    }

	    public void deposit(double amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid deposit amount.");
	        } else {
	            balance += amount;
	            System.out.println("Deposit successful. New balance: $" + balance);
	        }
	    }

}
