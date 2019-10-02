package com.concrete.factory;

import com.hierarchy.product.Chair;
import com.hierarchy.product.CoffeTable;
import com.hierarchy.product.Sofa;
import com.hierarchy.product.classes.VictorianChair;
import com.hierarchy.product.classes.VictorianCoffeTable;
import com.hierarchy.product.classes.VictorianSofa;
import com.master.factory.FurnitureFactory;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class VictorianFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		// TODO Auto-generated method stub
		return new VictorianChair();
	}

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new VictorianSofa();
	}

	@Override
	public CoffeTable createCoffeTable() {
		// TODO Auto-generated method stub
		return new VictorianCoffeTable();
	}

}
