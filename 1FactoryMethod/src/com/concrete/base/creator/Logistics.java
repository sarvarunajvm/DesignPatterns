package com.concrete.base.creator;

import com.concrete.interfaces.Transport;

public abstract class Logistics {
    
	public void planDelivery() {
		Transport transport = createTransport();
		transport.deliver();
    }
	
	public abstract Transport createTransport();
}
