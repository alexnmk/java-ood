class Car {​

​	public Car() {
	}

	public Car(int maxSpeed){​

		// code to check maxSpeed is valid number​

	}​

​

	public Car(int maxSpeed, String model) {​

		this(maxSpeed);​

		this.modell = model;​

	}​
	
	
	public Car(int maxSpeed, String model, boolean isTrue) {​	
		
		this(maxSpeed, model);
		
		isTrue = true;
	}​

​
	public static void main(String[] args) {
	
		Car car1 = new Car();
		Car car2 = new Car(3);
		Car car3 = new Car(6, "Toyota"); 
		Car car4 = new Car(8, "Honda", true); 
	}

}
