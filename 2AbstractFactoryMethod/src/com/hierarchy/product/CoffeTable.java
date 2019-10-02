package com.hierarchy.product;
/**
 * Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (Chair/Sofa/Table). All products of
 * the same family have the common interface.
 *
 * This is the common interface for CoffeTable family.
 */
public interface CoffeTable {
	void hasLegs();
	void sitOn();
}
