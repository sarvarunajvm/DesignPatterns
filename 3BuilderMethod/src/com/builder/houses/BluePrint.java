package com.builder.houses;

public class BluePrint {

	private int doors;
	private int windows;
	private int rooms;

	private Type type;
	private Garage garage;
	private SwimmingPool swimmingPool;
	private Statue statue;
	private Garden garden;

	public BluePrint(int doors, int windows, int rooms, Type type, Garage garage, SwimmingPool swimmingPool,
			Statue statue, Garden garden) {
		super();
		this.doors = doors;
		this.windows = windows;
		this.rooms = rooms;
		this.type = type;
		this.garage = garage;
		this.swimmingPool = swimmingPool;
		this.statue = statue;
		this.garden = garden;
	}

	public String print() {
		String info = "";
		info += "Type of House: " + type + "\n";
		info += "Count of Doors: " + doors + "\n";
		info += "Count of Windows: " + windows + "\n";
		info += "Count of Rooms: " + rooms + "\n";
		if (this.garage != null) {
			if (this.garage.isAutomaticDoorNeeded()) {
				info += "Garage has automatic door : Functional" + "\n";
			} else {
				info += "Garage has Manual door : Functional" + "\n";
			}
		} else {
			info += "Garage Not available in this house. " + "\n";
		}
		if (this.swimmingPool != null) {
			info += "Swimming Pool Spec : Size - " + this.swimmingPool.getHowDeep() + "And Capacity of - "
					+ this.swimmingPool.getWaterCapacity() + "\n";
		} else {
			info += "Swimming Not available in this house. " + "\n";
		}

		if (this.statue != null) {
			info += "Statue type is :  " + this.statue + "\n";
		} else {
			info += "Statue Not available in this house. " + "\n";
		}

		if (this.garden != null) {
			info += "Garden Spec : Size - " + this.garden.getSize() + "acres" + "\n";
			if (this.garden.isFlowersNeeded()) {
				info += "Garden has Flowers" + "\n";
			} else {
				info += "Garden has no Flowers" + "\n";
			}
			if (this.garden.isTreesNeeded()) {
				info += "Garden has Trees" + "\n";
			} else {
				info += "Garden has no Trees" + "\n";
			}
		} else {
			info += "Garden Not available in this house. " + "\n";
		}

		return info;
	}

}
