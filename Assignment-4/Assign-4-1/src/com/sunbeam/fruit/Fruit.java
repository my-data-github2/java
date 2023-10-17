package com.sunbeam.fruit;

import java.util.Scanner;

public class Fruit {
	protected String color;
	protected double weight;
	protected String name;
	protected boolean isFresh;

	public Fruit() {
	}

	public Fruit(String color, double weight, String name, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter color : ");
		this.color = sc.next();
		System.out.print("Enter weight : ");
		this.weight = sc.nextDouble();
		this.isFresh = true;
	}

	@Override
	public String toString() {
		return "Name : "  + this.name+ "|" + " Color : "  + this.color + "|"+ " Weight : " + this.weight;
	}

	public String taste() {
		return "No specific taste.";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

}
