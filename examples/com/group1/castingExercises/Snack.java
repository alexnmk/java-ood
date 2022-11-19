package com.fdmgroup.castingExercises;

public class Snack implements BasketItem, FoodItem {
	
	private int fatContent;
	private int sugarContent;
	private String name;
	private double price;
	private int calories;
	
	public int getFatContent() {
		return fatContent;
	}
	
	public void setFatContent(int fatContent) {
		this.fatContent = fatContent;
	}
	
	public int getSugarContent() {
		return sugarContent;
	}
	
	public void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
	}

	@Override
	public int getCalories() {
		return calories;
	}

	@Override
	public void setCalories(int calories) {
		this.calories = calories;
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
