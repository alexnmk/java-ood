package com.fdmgroup.dependenciesExercises;

public class Computer {
	private final String MODEL;
	private HardDrive hardDrive;
	private Memory memory;
	private final Processor PROCESSOR;
	
	public Computer(String model, HardDrive hardDrive, Memory memory, Processor processor) {
		this.MODEL = model;
		this.hardDrive = hardDrive;
		this.memory = memory;
		this.PROCESSOR = processor;
	}
	public HardDrive getHardDrive() {
		return hardDrive;
	}
	public Memory getMemory() {
		return memory;
	}
	public String getMODEL() {
		return MODEL;
	}
	public Processor getPROCESSOR() {
		return PROCESSOR;
	}
	public void setHardDrive(HardDrive hardDrive) {
		this.hardDrive = hardDrive;
	}
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
	public void turnOn() {
		System.out.println("Computer is turned on.");
	}
	public void turnOff() {
		System.out.println("Computer is turned off.");
	}
}
