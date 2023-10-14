package com.sunbeam.employee;

import java.util.Scanner;

public class Employee {
private String firstName;
private String lastName;
private double salary;

public Employee() {
	// TODO Auto-generated constructor stub
	 firstName =  firstName;
	 lastName  =  lastName;
	 salary = salary;
}
// Getters

public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

public double getSalary() {
	return salary;
}

//setters
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public void setSalary(double salary) {
	this.salary = salary;
}
public void accept() {
	System.out.println("Enter First Name: ");
	Scanner sc = new Scanner(System.in);
	firstName = sc.nextLine();
	System.out.println("Enter Last name: ");
	lastName = sc.nextLine();
	System.out.println("Enter Salary: ");
	salary = sc.nextDouble();
}
public double display(){
	return 12*salary;
}
public void salaryRaise() {
	 setSalary(0.1*salary);
}
public void displaySalaryRaise() {
	System.out.println(getSalary()*12);
	
}
};

