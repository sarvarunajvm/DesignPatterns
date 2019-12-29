package com.concrete.base.creator;

import com.concrete.interfaces.Transport;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */

public abstract class Logistics {
    
	public void planDelivery() {
		Transport transport = createTransport();
		transport.deliver();
    }
	
    /**
     * Subclasses will override this method in order to create specific Transport
     * objects.
     */
	
	public abstract Transport createTransport();
}
