package com.builder.houses;

/**
 * Just another feature of a house.
 */
public class SwimmingPool {
	private int waterCapacity;
	private double howDeep;

	public SwimmingPool(int waterCapacity, double howDeep) {
		this.waterCapacity = waterCapacity;
		this.howDeep = howDeep;
	}

	public int getWaterCapacity() {
		return waterCapacity;
	}

	public void setWaterCapacity(int waterCapacity) {
		this.waterCapacity = waterCapacity;
	}

	public double getHowDeep() {
		return howDeep;
	}

	public void setHowDeep(double howDeep) {
		this.howDeep = howDeep;
	}

}
