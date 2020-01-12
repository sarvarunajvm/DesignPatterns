package com.builder.base;

import com.builder.builders.BluePrintBuilder;
import com.builder.builders.HouseBuilder;
import com.builder.director.Director;
import com.builder.houses.BluePrint;
import com.builder.houses.House;

/**
 * Application class. Everything comes together here.
 */
public class Application {

	public static void main(String[] args) {
		Director director = new Director();

		// Director gets the concrete builder object from the client
		// (application code). That's because application knows better which
		// builder to use to get a specific product.
		HouseBuilder builder = new HouseBuilder();
		director.buildHouseWithAllFeature(builder);

		// The final product is often retrieved from a builder object, since
		// Director is not aware and not dependent on concrete builders and
		// products.
		House house = builder.getResult();
		System.out.println("House built:\n" + house.getType());

		BluePrintBuilder bluePrintBuilder = new BluePrintBuilder();

		// Director may know several building recipes.
		director.buildHouseWithAllFeature(bluePrintBuilder);
		BluePrint bluePrint = bluePrintBuilder.printBluePrint();
		System.out.println("\n House blue print :\n" + bluePrint.print());
	}

}
