package com.sunbeam.fruit;

public class Mango extends Fruit {

	public Mango() {
		this.name = "Mango";
	}
	public Mango(String color, double weight, boolean isFresh) {
		super(color, weight, "Mango", isFresh);
	}

	@Override
	public String taste() {
		return "sweet";
	}
}
