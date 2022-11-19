package com.fdmgroup.staticKeywordExercises;

public class Runner {

	public static void main(String[] args) {
		// EnergyMatterCalculator
		System.out.println(EnergyMatterCalculator.matterToEnergy(2.0));
		System.out.println(EnergyMatterCalculator.energyToMatter(3.0));
		// Employee
		Employee.setMinimumWage(9.53);
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		employee1.setHourlyWage(9);
		employee2.setHourlyWage(8.53);
		employee3.setHourlyWage(10);
		System.out.println(employee1.getHourlyWage());
		System.out.println(employee2.getHourlyWage());
		System.out.println(employee3.getHourlyWage());
	}

}
