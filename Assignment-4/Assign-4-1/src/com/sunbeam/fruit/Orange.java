package com.sunbeam.fruit;

public class Orange extends Fruit {

	public Orange() {
		this.name = "Orange";
	}
	public Orange(String color, double weight, boolean isFresh) {
		super(color, weight, "Orange", isFresh);
	}

	@Override
	public String taste() {
		return "sour";
	}

}
