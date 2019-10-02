package com.concrete.other.creator;

import com.concrete.base.creator.Logistics;
import com.concrete.classes.Truck;
import com.concrete.interfaces.Transport;

public class RoadLogistics extends Logistics {
	/**
	 * RoadLogistics will create Transport for Truck.
	 */
	@Override
	public Transport createTransport() {
		return new Truck();
	}

}
