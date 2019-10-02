package com.hierarchy.product.classes;

import com.hierarchy.product.CoffeTable;

/**
 * All products families have the same varieties (Chair/Sofa/Table).
 *
 * This is a variant of a Mordern.
 */
public class MordernCoffeTable implements CoffeTable {

	@Override
	public void hasLegs() {
		System.out.println("Mordern CoffeTable has axle legs");
	}

	@Override
	public void sitOn() {
		System.out.println("No, We cannot sit on the Mordern CoffeTable");
	}

}
