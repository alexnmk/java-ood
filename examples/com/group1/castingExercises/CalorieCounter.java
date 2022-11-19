package com.fdmgroup.castingExercises;

import java.util.ArrayList;

public class CalorieCounter {
	private ArrayList<FoodItem> lowCalorieFoods = new ArrayList<FoodItem>();

	public void addLowCalorieFood(FoodItem foodItem) {
		if (foodItem.getCalories() <= 500) {
			lowCalorieFoods.add(foodItem);
		}
	}

	public ArrayList<FoodItem> getAllLowCalorieFoods() {
		return lowCalorieFoods;
	}

	public void removeHighCalorieFoodsFromBasket(Basket basket, int calories) {
		ArrayList<BasketItem> basketItems = basket.getAllItems();
		for (int i=0; i<basketItems.size(); i++) {
			if (basketItems.get(i) instanceof FoodItem) {
				if(((FoodItem) basketItems.get(i)).getCalories() > calories) {
					basket.removeItem(basketItems.get(i));
					i--;
				}
			}
		}
	}
}
