package com.vehicleAl;

import java.util.Comparator;

public class VehiclePriceComparator implements Comparator<Vehicle> {
	
	@Override
	public int compare(Vehicle v1,Vehicle v2)
	{
		if(v1.getNetprice()>v2.getNetprice())
		{
			return 1;
		}
		if(v1.getNetprice()==v2.getNetprice())
			return 0;
		return -1;
	}
}
