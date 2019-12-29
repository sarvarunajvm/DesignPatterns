package com.master.factory;

import com.hierarchy.product.Chair;
import com.hierarchy.product.CoffeTable;
import com.hierarchy.product.Sofa;


/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface FurnitureFactory {
	Chair createChair();

	Sofa createSofa();

	CoffeTable createCoffeTable();
}
