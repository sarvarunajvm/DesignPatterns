package com.hierarchy.product.classes;

import com.hierarchy.product.Sofa;

/**
 * All products families have the same varieties (Chair/Sofa/Table).
 *
 * This is a variant of a Victorian.
 */
public class VictorianSofa implements Sofa {

	@Override
	public void hasLegs() {
		System.out.println("Victorian Sofa has four legs");
	}

	@Override
	public void sitOn() {
		System.out.println("Yes, We can sit on the Victorian Sofa");
	}

}
