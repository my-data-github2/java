package com.sunbeam.fruit;

public class Apple extends Fruit {
	
	public Apple() {
		this.name = "Apple";
	}

	public Apple(String color, double weight, boolean isFresh) {
		super(color, weight, "Apple", isFresh);
	}
	
	@Override
	public String taste() {
		return "sweet n sour";
	}
}
