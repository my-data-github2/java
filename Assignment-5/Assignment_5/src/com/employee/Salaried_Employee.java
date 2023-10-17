package com.employee;

import java.util.Scanner;

public class Salaried_Employee extends Employee{
	private double weeklySalary;
	
	
	@Override
	void acceptData() {
		super.acceptData();
		System.out.println("Enter the weekly salary");
		this.weeklySalary=new Scanner(System.in).nextDouble();
		
	}

	@Override
	public String toString() {
		return "Salaried_Employee [weeklySalary=" + weeklySalary + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void calculateEarning() {
		System.out.println("Total earning = "+weeklySalary);
		
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	
	

}
