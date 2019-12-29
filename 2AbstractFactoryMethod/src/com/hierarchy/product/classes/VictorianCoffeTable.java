package com.hierarchy.product.classes;

import com.hierarchy.product.CoffeTable;

/**
 * All products families have the same varieties (Chair/Sofa/Table).
 *
 * This is a variant of a Victorian.
 */
public class VictorianCoffeTable implements CoffeTable {

	@Override
	public void hasLegs() {
		System.out.println("Victorian CoffeTable has four legs");
	}

	@Override
	public void sitOn() {
		System.out.println("No, We cannot sit on the victorian CoffeTable");
	}

}
