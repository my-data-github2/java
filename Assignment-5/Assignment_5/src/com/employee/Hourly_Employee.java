package com.employee;

import java.util.Scanner;

public class Hourly_Employee extends Employee{
	
	private int hourlyWage;
	private int workingHours;
	
	@Override
	void acceptData() {
		super.acceptData();
		System.out.println("enter the hourly wages");
		this.hourlyWage=new Scanner(System.in).nextInt();
		System.out.println("enter the working hours");
		this.workingHours=new Scanner(System.in).nextInt();
	}

	@Override
	public String toString() {
		return "Hourly_Employee [hourlyWage=" + hourlyWage + ", workingHours=" + workingHours + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public void calculateEarning() {
		double earning=0;
		if (workingHours<=40)
			earning=hourlyWage*workingHours;
		else if (workingHours>40)
		earning=40*hourlyWage+(workingHours-40)*hourlyWage*1.5 ;
		System.out.println("total Earning = "+earning);
			
		
	}

	public int getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
	

	
	
	
	

}
