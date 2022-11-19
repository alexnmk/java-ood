package com.fdmgroup.staticKeywordExercises;

public class Employee {
	private String name;
	private String jobTitle;
	private double hourlyWage;
	private static double minimumWage;
	
	public double getHourlyWage() {
		return hourlyWage;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public static double getMinimumWage() {
		return minimumWage;
	}
	public String getName() {
		return name;
	}
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = (hourlyWage < minimumWage) 
				? minimumWage : hourlyWage;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public static void setMinimumWage(double minimumWage) {
		Employee.minimumWage = minimumWage;
	}
	public void setName(String name) {
		this.name = name;
	}
}
