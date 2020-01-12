package com.builder.builders;

import com.builder.houses.Garage;
import com.builder.houses.Garden;
import com.builder.houses.Statue;
import com.builder.houses.SwimmingPool;
import com.builder.houses.Type;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {

	void setDoors(int doors);

	void setWindows(int windows);

	void setRooms(int rooms);

	void setType(Type type);

	void setGarage(Garage garage);

	void setSwimmingPool(SwimmingPool swimmingPool);

	void setStatues(Statue statue);

	void setGarden(Garden garden);
}
