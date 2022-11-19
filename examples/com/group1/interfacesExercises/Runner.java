package com.fdmgroup.interfacesExercise;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toy toy1 = new Toy();
		toy1.setMaxAge(50);
		toy1.setMinAge(7);
		toy1.setName("Pikachu");
		toy1.setPrice(99.99);
		Laptop laptop1 = new Laptop();
		laptop1.setCpuSpeed(53.4);
		laptop1.setHardDrive(43.2);
		laptop1.setMemory(32.1);
		laptop1.setName("Dell");
		laptop1.setPrice(4670.99);
		Snack snack1 = new Snack();
		snack1.setCalories(509);
		snack1.setFatContent(32);
		snack1.setName("Candy");
		snack1.setPrice(12.9);
		snack1.setSugarContent(35);
		Snack snack2 = new Snack();
		snack2.setCalories(430);
		snack2.setFatContent(23);
		snack2.setName("Chocolate");
		snack2.setPrice(20.9);
		snack2.setSugarContent(78);
		ReadyMeal readyMeal1 = new ReadyMeal();
		readyMeal1.setCalories(605);
		readyMeal1.setCuisineType("Western");
		readyMeal1.setName("Steak");
		readyMeal1.setPrice(239);
		ReadyMeal readyMeal2 = new ReadyMeal();
		readyMeal2.setCalories(230);
		readyMeal2.setCuisineType("Japanese");
		readyMeal2.setName("Sushi");
		readyMeal2.setPrice(899);
		Basket basket = new Basket();
		CalorieCounter calorieCounter = new CalorieCounter();
		
		basket.addItem(readyMeal2);
		basket.addItem(readyMeal1);
		basket.addItem(snack1);
		basket.addItem(snack2);
		basket.addItem(laptop1);
		basket.addItem(toy1);
		for (BasketItem basketItem : basket.getAllItems()) {
			System.out.println(basketItem.getName());
		}
		System.out.println();
		basket.removeItem(readyMeal2);
		for (BasketItem basketItem : basket.getAllItems()) {
			System.out.println(basketItem.getName());
		}
		System.out.println();
		calorieCounter.addLowCalorieFood(readyMeal2);
		calorieCounter.addLowCalorieFood(readyMeal1);
		calorieCounter.addLowCalorieFood(snack2);
		calorieCounter.addLowCalorieFood(snack1);
		
		//calorieCounter.addLowCalorieFood(toy1);
		//calorieCounter.addLowCalorieFood(laptop1);
		for (FoodItem foodItem : calorieCounter.getAllLowCalorieFoods()) {
			System.out.println(foodItem.getCalories());
		}
	}

}
