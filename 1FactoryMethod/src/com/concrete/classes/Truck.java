package com.concrete.classes;

import com.concrete.interfaces.Transport;

public class Truck implements Transport {

	@Override
	public void deliver() {
		System.out.println("The Mode of transport is truck");
	}

}
