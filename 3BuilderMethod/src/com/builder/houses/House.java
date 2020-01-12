package com.builder.houses;

public class House {

	private int doors;
	private int windows;
	private int rooms;

	private Type type;
	private Garage garage;
	private SwimmingPool swimmingPool;
	private Statue statue;
	private Garden garden;

	public House(int doors, int windows, int rooms, Type type, Garage garage, SwimmingPool swimmingPool, Statue statue,
			Garden garden) {
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

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Garage getGarage() {
		return garage;
	}

	public void setGarage(Garage garage) {
		this.garage = garage;
	}

	public SwimmingPool getSwimmingPool() {
		return swimmingPool;
	}

	public void setSwimmingPool(SwimmingPool swimmingPool) {
		this.swimmingPool = swimmingPool;
	}

	public Statue getStatue() {
		return statue;
	}

	public void setStatue(Statue statue) {
		this.statue = statue;
	}

	public Garden getGarden() {
		return garden;
	}

	public void setGarden(Garden garden) {
		this.garden = garden;
	}

}
