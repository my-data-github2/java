package com.sunbeam;

import java.util.Scanner;

interface Arithmetic{
	double calc(double  d1, double d2);
}

public class Arith implements Arithmetic {
	
	static void calculate(double num1, double num2, Arithmetic op) { 
	    double result = op.calc(num1, num2); 
	    System.out.println("Result: "+result); 
	} 
	@Override
	public double calc(double d1, double d2) {

	return 0;
	}	
	static int menu() {
		int choice;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0. Exit");
		System.out.println("1.  Add");
		System.out.println("2. Substract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.print("Enter your choice:");
		choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		int choice;
		double num1=0, num2=0;
		Scanner sc = new Scanner(System.in);
		while((choice = menu())!= 0) {
			switch(choice) {
			case 1:
				num1 = sc.nextDouble();
				num2 = sc.nextDouble();
				calculate(num1, num2,(d1,d2) -> d1+d2);
				break;
			case 2:
				num1 = sc.nextDouble();
				num2 = sc.nextDouble();
				calculate(num1, num2,(d1,d2) -> d1-d2);
				break;
			case 3:
				num1 = sc.nextDouble();
				num2 = sc.nextDouble();
				calculate(num1, num2,(d1,d2) -> d1*d2);
				break;
			case 4:
				num1 = sc.nextDouble();
				num2 = sc.nextDouble();
				calculate(num1, num2,(d1,d2) -> d1/d2);
				break;
				
			}
		}
		
	}
	
}
	

