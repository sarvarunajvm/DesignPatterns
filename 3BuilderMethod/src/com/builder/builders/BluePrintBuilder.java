package com.builder.builders;

import com.builder.houses.BluePrint;
import com.builder.houses.Garage;
import com.builder.houses.Garden;
import com.builder.houses.Statue;
import com.builder.houses.SwimmingPool;
import com.builder.houses.Type;

public class BluePrintBuilder implements Builder {

	private int doors;
	private int windows;
	private int rooms;

	private Type type;
	private Garage garage;
	private SwimmingPool swimmingPool;
	private Statue statue;
	private Garden garden;

	@Override
	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public void setWindows(int windows) {
		this.windows = windows;
	}

	@Override
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	@Override
	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public void setGarage(Garage garage) {
		this.garage = garage;
	}

	@Override
	public void setSwimmingPool(SwimmingPool swimmingPool) {
		this.swimmingPool = swimmingPool;
	}

	@Override
	public void setStatues(Statue statue) {
		this.statue = statue;
	}

	@Override
	public void setGarden(Garden garden) {
		this.garden = garden;
	}

	public BluePrint printBluePrint() {
		return new BluePrint(doors, windows, rooms, type, garage, swimmingPool, statue, garden);
	}

}
