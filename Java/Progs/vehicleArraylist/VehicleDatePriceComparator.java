package com.vehicleAl;

import java.util.Comparator;

public class VehicleDatePriceComparator implements Comparator<Vehicle>  {
	
	public int compare(Vehicle v1,Vehicle v2)
	{
		int retvalue=v1.getMfgDate().compareTo(v2.getMfgDate());
		if(retvalue==0)
		{
			if(v1.getNetprice()>v2.getNetprice())
				return 1;
			if(v1.getNetprice()==v2.getNetprice())
				return 0;
			return 1;
		}
		return retvalue;
	}

}
