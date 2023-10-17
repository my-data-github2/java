package com.sunbeam;

import java.util.Scanner;

public class Manager extends Employee{

	private int bonus;
	
	public void accept() {
		super.accept();
		System.out.println("Enter the bonus: ");
		Scanner sc = new Scanner(System.in);
		bonus = sc.nextInt();
	}
	
	public void display() {
		super.display(); 
		System.out.println("Manger bonus: "+bonus);
	}
	
	public int calcTotalSalary() {
	return (super.getSal()+this.bonus);
	}
}