package com.sunbeam.point.test;
import java.util.Scanner;

import com.app.geometry.Point2D;

public class PointTest {

	public static void main(String[] args) {
	
		Point2D point = new Point2D();
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a point p1: ");
	System.out.println("Enter x1-coordinate: ");
    int x1 = sc.nextInt();
    point.setX1(x1);
	System.out.println("Enter y1-coordinate: ");
	int y1 = sc.nextInt();
	point.setY1(y1);
	System.out.println("Enter a point p2: ");
	System.out.println("Enter x2-coordinate: ");
	int x2 = sc.nextInt();
	point.setX2(x2);
	System.out.println("Enter y2-coordinate: ");
	int y2 = sc.nextInt();
	point.setY2(y2);
		
	
	point.getDetails();
	point.isEqual();
	
	if(point.isEqual()==true) {
		System.out.println("P1 & P2 are equal");
     	System.out.println("("+x1+","+y1+")=("+x2+","+y2+")");
	}
	else {
		System.out.print("Distance between P1 & P2: ");
        System.out.println(point.calculateDistance());
		
	}
	
	}

}
