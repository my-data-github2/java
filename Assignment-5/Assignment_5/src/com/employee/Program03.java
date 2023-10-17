package com.employee;

public class Program03 {

	public static void main(String[] args) {
		
		Employee e1;
		e1=new Commission_Employees();
		System.out.println("Commission employees details-------------");
		e1.acceptData();
		e1.calculateEarning();
		System.out.println(e1);
		System.out.println();
		
		Employee e2=new BasePlus_Commissioned_Employees();
		System.out.println("Baseplus Commission employees details-------------");
		e2.acceptData();
		e2.calculateEarning();
		System.out.println(e2);
		System.out.println();
		
		Employee e3=new Hourly_Employee();
		System.out.println("Hourly employees details-------------");
		e3.acceptData();
		e3.calculateEarning();
		System.out.println(e3);
		System.out.println();
		
		Employee e4=new Salaried_Employee();
		System.out.println("Salaried employees details-------------");
		e4.acceptData();
		e4.calculateEarning();
		System.out.println(e4);

	}

}
