package com.employee;

import java.util.Scanner;

public class BasePlus_Commissioned_Employees extends Commission_Employees{

	private int baseSalary;
	
	@Override
	void acceptData() {
		super.acceptData();
		System.out.println("Enter the base salary");
		baseSalary=new Scanner(System.in).nextInt();
	}

	@Override
	public String toString() {
		return "BasePlus_Commissioned_Employees [baseSalary=" + baseSalary + ", toString()=" + super.toString() + "]";
	}
	@Override
	public void calculateEarning() {
		
		
		System.out.println("Total Earning = "+((this.getCommissionRate()*this.getGrossSales())+this.baseSalary));
		
		System.out.println("Total Earning after Reward = "+((this.getCommissionRate()*this.getGrossSales())+(this.baseSalary+(this.baseSalary*0.1))));
	}
	
	public int getBaseSalary() {
		return this.baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	
}
