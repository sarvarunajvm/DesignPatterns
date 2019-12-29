package com.concrete.factory;

import com.hierarchy.product.Chair;
import com.hierarchy.product.CoffeTable;
import com.hierarchy.product.Sofa;
import com.hierarchy.product.classes.MordernChair;
import com.hierarchy.product.classes.MordernCoffeTable;
import com.hierarchy.product.classes.MordernSofa;
import com.master.factory.FurnitureFactory;


/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MordernFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		// TODO Auto-generated method stub
		return new MordernChair();
	}

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new MordernSofa();
	}

	@Override
	public CoffeTable createCoffeTable() {
		// TODO Auto-generated method stub
		return new MordernCoffeTable();
	}

}
