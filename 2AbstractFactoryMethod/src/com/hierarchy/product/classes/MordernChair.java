package com.hierarchy.product.classes;

import com.hierarchy.product.Chair;

/**
 * All products families have the same varieties (Chair/Sofa/Table).
 *
 * This is a variant of a Mordern.
 */
public class MordernChair implements Chair {

	@Override
	public void hasLegs() {
		System.out.println("Mordern Chair has axle legs");
	}

	@Override
	public void sitOn() {
		System.out.println("Yes, We can sit on the Mordern chair");
	}

}
