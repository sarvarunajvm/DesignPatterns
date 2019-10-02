package com.concrete.other.creator;

import com.concrete.base.creator.Logistics;
import com.concrete.classes.Ship;
import com.concrete.interfaces.Transport;

public class SeaLogistics extends Logistics{
	/**
	 * SeaLogistics will create Transport for Ship.
	 */
	@Override
	public Transport createTransport() {
		return new Ship();
	}

}
