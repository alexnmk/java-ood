package com.fdmgroup.classesAndObjectsExercises;

public class Memory {

	private final String MODEL;
	private final double CAPACITY;
	private double usedSpace;
	private final double SPPED;
	
	public Memory(String model, double capacity, double speed) {
		MODEL = model;
		CAPACITY = capacity;
		SPPED = speed;
	}
	public void storeData(String data) {
		System.out.println("storeData "+data);
	}
	public double getCAPACITY() {
		return CAPACITY;
	}
	public String getMODEL() {
		return MODEL;
	}
	public double getSPPED() {
		return SPPED;
	}
	public double getUsedSpace() {
		return usedSpace;
	}
	public void setUsedSpace(double usedSpace) {
		this.usedSpace = usedSpace;
	}
}
