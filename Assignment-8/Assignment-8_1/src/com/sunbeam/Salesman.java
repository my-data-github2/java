package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee{

	private int comm;
	
	public void accept() {
		super.accept();
		System.out.println("Enter the commission: ");
		Scanner sc = new Scanner(System.in);
		comm = sc.nextInt();
	}
	
	public void display() {
		super.display();
		System.out.println("Salesman Commision: "+comm);
	}
	
	public int calcTotalSalary() {
		return (super.getSal()+this.comm);
	}
}
