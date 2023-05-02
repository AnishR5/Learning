//VALIDATE
//1)NO Duplicate Chasisno 
//2)Max 1yr mfgdate
//3)Color

package com.vehicle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ValidationRules {
	
	
	public static Vehicle validateAllValidations(String chasisno, String company, String color, double baseprice, String mfgDate,Vehicle[] vehicles) throws VehicleInvalidException
	{
		duplicateChasisno(chasisno, vehicles);
		Color validcolor=parseandvalidatecolor(color);
		double netsal=baseprice+validcolor.price;
		LocalDate validdate= parseandvalidatemgfdate(mfgDate);
		
		return new Vehicle(chasisno, company, validcolor, netsal, validdate);
	}
	
	public static void duplicateChasisno(String newChasisno,Vehicle[] showroom) throws VehicleInvalidException
	{
		Vehicle newvehicle=new Vehicle(newChasisno);
		for(Vehicle v:showroom)
		{
			if(v!=null)
			{
			if(v.equals(newvehicle))
			{
				throw new VehicleInvalidException("Invalid Chasisnumber!!!!Duplicate Chasis number found");
			}
			}
		}
		System.out.println("NO duplicate chasis number");
	}
	
	
	
	public static Color parseandvalidatecolor(String color)
	{
		return Color.valueOf(color.toUpperCase());
	}
	
	public static LocalDate parseandvalidatemgfdate(String mgf) throws VehicleInvalidException
	{
		LocalDate mfgd=LocalDate.parse(mgf, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		LocalDate startyear=LocalDate.of(LocalDate.now().getYear(), 1, 1);
		
		if(mfgd.isBefore(startyear))
		{
			throw new VehicleInvalidException("Invalid Mgfdate,Vehicle older than 1 year");
		}
		
		return mfgd;
	}

}
