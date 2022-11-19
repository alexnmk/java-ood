package com.fdmgroup.interfacesExercise;

public class Toy implements BasketItem {
	
	private int minAge;
	private int maxAge;
	private String name;
	private double price;
	
	public int getMinAge() {
		return minAge;
	}
	
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	
	public int getMaxAge() {
		return maxAge;
	}
	
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

}
