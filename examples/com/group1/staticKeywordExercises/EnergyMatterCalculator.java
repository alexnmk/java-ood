package com.fdmgroup.staticKeywordExercises;

public class EnergyMatterCalculator {
	public static final double SPEED_OF_LIGHT = 299_792_458;
	
	public static double matterToEnergy(double matter) {
		return matter*Math.pow(SPEED_OF_LIGHT,2);
	}
	public static double energyToMatter(double energy) {
		return energy/Math.pow(SPEED_OF_LIGHT,2);
	}
}
