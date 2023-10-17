package com.sunbeam.credit.calculator;

import java.util.Scanner;

public class CreditsCalculator {

	private int accoutNumber;
	private int balance;
	private int itemsCharged;
	private int credits;
	private int allowedCredits;
	
	public CreditsCalculator() {
	}
	
	public 	CreditsCalculator(int accountNumber, int balance, int itemsCharged, int credits, int allowedCredits){
		this.accoutNumber = accountNumber;
		this.balance = balance;
		this.credits = credits;
		this.allowedCredits = allowedCredits;
	}
	
	//Getters
	public int getAccoutNumber() {
		return accoutNumber;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int getItemsCharged() {
		return itemsCharged;
	}
	public int getCredits() {
		return credits;
	}
	public int getAllowedCredits() {
		return allowedCredits;
	}
	
	//Setters
	
	public void setAccoutNumber(int accoutNumber) {
		this.accoutNumber = accoutNumber;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	} 
	
	public void setItemsCharged(int itemsCharged) {
		this.itemsCharged = itemsCharged;
	}
	
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public void setAllowedCredits(int allowedCredits) {
		this.allowedCredits = allowedCredits;
	}
	
	public double calculateBalance() {
		  double newBalance = (this.balance + this.itemsCharged) - this.credits;
		  System.out.println("Your Current Balance: "+newBalance);
		  if(newBalance > allowedCredits) {
			  System.out.println("Credit limit exceeded");
		  }
		  return newBalance;
		}
	
	public void accept() {
		System.out.print("Enter Account No.: ");
		Scanner sc = new Scanner(System.in);
	     setAccoutNumber(sc.nextInt()); 
	    System.out.print("Enter the balance: ");
	    setBalance( sc.nextInt());
	    System.out.print("Enter total number of items charged: "); 
	    setItemsCharged(sc.nextInt());
	    System.out.print("Enter total of credits applied to the account: ");
	    setCredits(sc.nextInt());
	    System.out.print("Enter the allowed credits: ");
	    setAllowedCredits(sc.nextInt());
	}


	public static void main(String[] args) {
		
		CreditsCalculator c1;
		c1 = new CreditsCalculator();
		c1.accept();
		c1.calculateBalance();
		
		

	}

};
