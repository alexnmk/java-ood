package com.fdmgroup.classesAndObjectsExercises;

public class Processor {

	private String MODEL;
	private double SPEED;
	private int NUMBER_OF_CORES;
	
	public Processor(String Model, double speed, int numberOfCores) {
		MODEL = Model;
		SPEED = speed;
		NUMBER_OF_CORES = numberOfCores;
	}
	public void processData(String data) {
		System.out.println("processData"+data);
	}
	public String getMODEL() {
		return MODEL;
	}
	public int getNUMBER_OF_CORES() {
		return NUMBER_OF_CORES;
	}
	public double getSPEED() {
		return SPEED;
	}

}
