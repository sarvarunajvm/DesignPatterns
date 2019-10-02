package com.core;

import java.util.Scanner;

import com.base.app.FactoryApplication;
import com.concrete.factory.MordernFactory;
import com.concrete.factory.VictorianFactory;
import com.master.factory.FurnitureFactory;
/**
 * DemoAbstractFactory class. Everything comes together here.
 */
public class DemoAbstractFactory {
	private static FactoryApplication confirmOrder(int option) {
	    /**
	     * Application picks the factory type and creates it in run time (usually at
	     * initialization stage), depending on the configuration or environment
	     * variables.
	     */
		
		FactoryApplication factoryApplication;
		FurnitureFactory furnitureFactory;
		if (option == 1) {
			furnitureFactory = new VictorianFactory();
			factoryApplication = new FactoryApplication(furnitureFactory);
			return factoryApplication;
		} else if (option == 2) {
			furnitureFactory = new MordernFactory();
			factoryApplication = new FactoryApplication(furnitureFactory);
			return factoryApplication;
		} else {
			System.out.println("Please select only : 1 or 2");
		}
		return null;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please select the Order option :");
		System.out.println("1 -> Victorian");
		System.out.println("2 -> Morder");
		int option = scanner.nextInt();
		FactoryApplication factoryApplication = confirmOrder(option);
		factoryApplication.legsCount();
		factoryApplication.canSit();
		System.out.println("Your Package will be delivered within 10 working days");
		scanner.close();
    }
}
