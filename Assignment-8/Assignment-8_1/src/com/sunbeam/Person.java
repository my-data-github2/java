package com.sunbeam;

import java.util.Scanner;

public class Person {
private String name;
private int age;

public void accept() {
	System.out.print("Enter the name: ");
	Scanner sc = new Scanner(System.in);
    name = sc.nextLine();
    System.out.print("Enter the age: ");
    age = sc.nextInt();
}

public void display() {
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
}
}