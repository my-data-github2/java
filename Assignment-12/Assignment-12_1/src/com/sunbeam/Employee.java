package com.sunbeam;

interface Emp {

	double getSal();

	default double calcIncentives() {
		return 0.0;
	}

	static double calcTotalIncome(Emp arr[]) {
		double totalSal = 0.0;
		for (Emp e : arr) {
			totalSal += e.calcIncentives() + e.getSal();
		}
		return totalSal;
	}
}

class Manager implements Emp {
	int basicSalary;
	int dearanceAllowance;

	public Manager(int basicSalary, int dearanceAllowance) {
		super();
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public double getSal() {

		return basicSalary + dearanceAllowance;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getDearanceAllowance() {
		return dearanceAllowance;
	}

	public void setDearanceAllowance(int dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public double calcIncentives() {
		return getSal() * 0.2;
	}

}

class Labour implements Emp {

	int hours;
	int rate;

	public Labour(int hours, int rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public double getSal() {
		return hours * rate;
	}

	@Override
	public double calcIncentives() {
		if (hours > 300)
			return getSal() * 0.05;
		else
			return 0.0;
	}

}

class Clerk implements Emp {

	int sal;

	public Clerk(int sal) {
		super();
		this.sal = sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public double getSal() {
		return sal;
	}

}

public class Employee {
	public static void main(String[] args) {

		Emp[] arr = new Emp[3];
		arr[0] = new Manager(1000, 340);
		arr[1] = new Labour(9, 450);
		arr[2] = new Clerk(4000);
		double totalSalary = Emp.calcTotalIncome(arr);
		System.out.println(totalSalary);
	}

}
