package com.builder.director;

import com.builder.builders.Builder;
import com.builder.houses.Garage;
import com.builder.houses.Garden;
import com.builder.houses.Statue;
import com.builder.houses.SwimmingPool;
import com.builder.houses.Type;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */
public class Director {

	public void buildSimpleHouse(Builder builder) {
		builder.setType(Type.SIMPLE);
		builder.setDoors(1);
		builder.setRooms(2);
		builder.setWindows(2);
	}

	public void buildHouseWithGarage(Builder builder) {
		builder.setType(Type.WITH_GARAGE);
		builder.setDoors(1);
		builder.setRooms(2);
		builder.setWindows(2);
		builder.setGarage(new Garage(true));
	}

	public void buildHouseWithSwimmingPool(Builder builder) {
		builder.setType(Type.WITH_SWIMMING_POOL);
		builder.setDoors(1);
		builder.setRooms(2);
		builder.setWindows(2);
		builder.setSwimmingPool(new SwimmingPool(1000, 6.0));
	}

	public void buildHouseWithStatues(Builder builder) {
		builder.setType(Type.WITH_FANCY_STATUE);
		builder.setDoors(1);
		builder.setRooms(2);
		builder.setWindows(2);
		builder.setStatues(Statue.MODELING);
	}

	public void buildHouseWithGardern(Builder builder) {
		builder.setType(Type.WITH_GARDEN);
		builder.setDoors(1);
		builder.setRooms(2);
		builder.setWindows(2);
		builder.setGarden(new Garden(true, true, 1));
	}

	public void buildHouseWithAllFeature(Builder builder) {
		builder.setType(Type.WITH_ALL_FEATUES);
		builder.setDoors(1);
		builder.setRooms(2);
		builder.setWindows(2);
		builder.setGarage(new Garage(true));
		builder.setSwimmingPool(new SwimmingPool(1000, 6.0));
		builder.setStatues(Statue.CARVING);
		builder.setGarden(new Garden(true, true, 1));
	}

}
