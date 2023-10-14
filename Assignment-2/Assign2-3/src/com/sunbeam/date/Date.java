package com.sunbeam.date;

import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
		day = 10;
		month = 9;
		year = 2023;
	}
	
	//getters
	
//	@Override
//	public String toString() {
//		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
//	}

	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	//Setters
	 public void setDay(int day) {
		this.day = day;
	}
	 
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void accept() {
	System.out.println("Enter the day: ");
	Scanner sc = new Scanner(System.in);
	this.day = sc.nextInt();
	System.out.println("Enter the month: ");
	this.month = sc.nextInt();
	System.out.println("Enter the year: ");
	this.year = sc.nextInt();
	}
	
	public void displayDate() {
		System.out.println(this.day+"/"+this.month+"/"+this.year);
		
	}
	
};
