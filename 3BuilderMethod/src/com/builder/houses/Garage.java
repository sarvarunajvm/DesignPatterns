package com.builder.houses;

/**
 * Just another feature of a house.
 */
public class Garage {
	
	private boolean automaticDoorNeeded;

	public boolean isAutomaticDoorNeeded() {
		return automaticDoorNeeded;
	}

	public void setAutomaticDoorNeeded(boolean automaticDoorNeeded) {
		this.automaticDoorNeeded = automaticDoorNeeded;
	}
	
    public Garage(boolean automaticDoorNeeded) {
        this.automaticDoorNeeded = automaticDoorNeeded;
    }
	
}
