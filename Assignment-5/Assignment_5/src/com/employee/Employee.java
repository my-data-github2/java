package com.employee;

import java.util.Scanner;

abstract public class Employee {
	private String firstName;
	private String lastName;
	private int sSN;
	
	abstract public void calculateEarning();
	
	public Employee() {
		super();
		
	}
	public Employee(String firstName, String lastName, int sSN) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.sSN = sSN;
	}
	
	void acceptData()
	{
		System.out.println("Enter the first name = ");
		this.firstName=new Scanner (System.in).nextLine();
		System.out.println("Enter the last Name = ");
		this.lastName=new Scanner (System.in).nextLine();
		System.out.println("Enter the social security number = ");
		this.sSN=new Scanner (System.in).nextInt();
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getsSN() {
		return sSN;
	}

	public void setsSN(int sSN) {
		this.sSN = sSN;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", sSN=" + sSN + "]";
	}
	
	
	

}
