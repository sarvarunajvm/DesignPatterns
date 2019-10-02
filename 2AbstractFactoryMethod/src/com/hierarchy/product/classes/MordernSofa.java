package com.hierarchy.product.classes;

import com.hierarchy.product.Sofa;

/**
 * All products families have the same varieties (Chair/Sofa/Table).
 *
 * This is a variant of a Mordern.
 */
public class MordernSofa implements Sofa {

	@Override
	public void hasLegs() {
		System.out.println("Mordern Sofa has axle legs");
	}

	@Override
	public void sitOn() {
		System.out.println("Yes, We can sit on the Mordern Sofa");
	}

}