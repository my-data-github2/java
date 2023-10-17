package com.sunbeam;

import java.util.Scanner;

public abstract class Employee extends Person {

	private int id;
	private int sal;
	
	public void accept() {
		super.accept();
		System.out.println("Enter id: ");
		Scanner sc = new Scanner(System.in);
		id  = sc.nextInt();
		System.out.println("Enter Salary: ");
		sal = sc.nextInt();
		}
	public void display() {
		super.display();
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Salary: "+sal);
	}
//	 Getters
	public int getId() {
		return id;
	}
	public int getSal() {
		return sal;
	}
	
//	Setters
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	abstract int calcTotalSalary();
	
}
