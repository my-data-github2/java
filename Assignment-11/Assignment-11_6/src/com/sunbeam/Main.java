
package com.sunbeam;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main extends Student {

	public static int menu() {
		int choice;
		System.out.println("0. Exit");
		System.out.println("1. Insert Student in map");
		System.out.println("2. Find Student in map with his roll number");
		System.out.print("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		return choice;
	}
	
	public static void acceptStudent(Student s) {
		System.out.print("Enter the rollno: ");
		Scanner sc = new Scanner(System.in);
	     setRoll(sc.nextInt());
		System.out.print("Enter the name: ");
		 setName(sc.nextLine());
		System.out.print("Enter the marks: ");
		setMarks(sc.nextDouble());
		
	}	
	
	public static void main(String[] args) {
		Map<Integer, Student> map = new LinkedHashMap<>();
		int choice;
		Student s;		
		
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: // Insert Student in map
				s = new Student();
		        acceptStudent(s);
				map.put(s.getRoll(), s);
				System.out.println(map);

				break;
			case 2: // Find Student in map with his roll number
				Scanner sc = new Scanner(System.in);
				int roll = sc.nextInt();
				Student r = map.get(roll);
				System.out.println(r);
				break;

			}

		}
	}



}