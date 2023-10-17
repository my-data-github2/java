package com.sunbeam.tester;

import java.util.Scanner;

import com.sunbeam.point.Point2D;


public class Point2DTest {
	
	
	public int menu() {
		System.out.println("0. Exit");
		System.out.println("1. Diplay details of specific point");
		System.out.println("2. Display x,y Coordinates of all points");
		System.out.println("4. Display between two points if not same");
		System.out.print("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		int choice  = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		
		int choice;
		Point2D point  = new Point2D();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of points to enter: ");
		int pNum = sc.nextInt();
		for(int i =0; i<pNum; i++) {
			System.out.println("Enter a point P"+i+": ");
			System.out.println("Enter x"+i+"-coordinate: ");
		    int xi = sc.nextInt();
		    point.setX1(xi);
			System.out.println("Enter y"+i+"-coordinate: ");
			int yi = sc.nextInt();
			point.setY1(yi);
		}
		
		while((choice = menu())!= 0) {
			switch(choice) {
			
			
			
			}
		}
		

	}

}
