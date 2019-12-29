package com.base.app;

import com.hierarchy.product.Chair;
import com.hierarchy.product.CoffeTable;
import com.hierarchy.product.Sofa;
import com.master.factory.FurnitureFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */

public class FactoryApplication {
	private Chair chair;
	private Sofa sofa;
	private CoffeTable coffeTable;
	
	public FactoryApplication(FurnitureFactory furnitureFactory) {
		chair = furnitureFactory.createChair();
		sofa = furnitureFactory.createSofa();
		coffeTable = furnitureFactory.createCoffeTable();
	}
	public void legsCount() {
		chair.hasLegs();
		sofa.hasLegs();
		coffeTable.hasLegs();
    }
	public void canSit() {
		chair.sitOn();
		sofa.sitOn();
		coffeTable.sitOn();
    }
}
