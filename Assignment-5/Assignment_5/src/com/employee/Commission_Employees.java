package com.employee;

import java.util.Scanner;

public class Commission_Employees extends Employee{
	private int grossSales;
	private int commissionRate;
	
	@Override
	void acceptData() {
		super.acceptData();
		System.out.println("Enter the gross sales");
		this.grossSales=new Scanner(System.in).nextInt();
		System.out.println("Enter the commission rate");
		this.commissionRate=new Scanner(System.in).nextInt();
	}

	@Override
	public String toString() {
		return "Commission_Employees [grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public void calculateEarning() {
		double earning=0;
		earning=this.commissionRate*this.grossSales ;
		System.out.println("Earning = "+earning);
		
	}

	public int getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}

	public int getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(int commissionRate) {
		this.commissionRate = commissionRate;
	}

	
	
	

}
