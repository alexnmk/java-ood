package com.fdmgroup.dependenciesExercises;

public class HardDrive {
	private final String MODEL;
	private final double CAPACITY;
	private double usedSpace;
	
	public HardDrive(String model, double capacity) {
		MODEL = model;
		CAPACITY = capacity;
	}
	public String getMODEL() {
		return MODEL;
	}
	public double getCAPACITY() {
		return CAPACITY;
	}
	public double getUsedSpace() {
		return usedSpace;
	}
	public void setUsedSpace(double usedSpace) {
		this.usedSpace = usedSpace;
	}
	public String readData(String file) {
		return "data from "+file;
	}
	public void writeData(String data, String file) {
		System.out.println("writeData "+data+" into "+file);
	}
}
