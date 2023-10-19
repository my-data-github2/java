package com.sunbeam;

import java.util.Scanner;

public class Student {
	private int roll;
	private String name;
	private double marks;

	public Student() {

	}

	public int getRoll() {
		return roll;
	}

	public static void setRoll(int roll) {
		roll = roll;
	}

	public String getName() {
		return name;
	}

	public static void setName(String name) {
		name = name;
	}

	public double getMarks() {
		return marks;
	}

	public static void setMarks(double marks) {
		marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	public Student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
}
