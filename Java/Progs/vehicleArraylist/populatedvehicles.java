package com.vehicleAl;

import static com.vehicleAl.ValidationRules.validateAllValidations;

import java.util.ArrayList;

public class populatedvehicles {
	
	public static ArrayList<Vehicle> addpopvehicles() throws VehicleInvalidException 
	{
		ArrayList<Vehicle> vehicles=new ArrayList<Vehicle>();
		vehicles.add(validateAllValidations("abc-123", "Hyundai", "Red", 500000, "12-05-2023", vehicles));
		vehicles.add(validateAllValidations("abc-133", "Mercedes", "Red", 500000, "12-05-2023", vehicles));
		vehicles.add(validateAllValidations("abc-124", "Hyundai", "Red", 500000, "12-05-2023", vehicles));
		vehicles.add(validateAllValidations("abc-125", "Honda", "Red", 500000, "12-05-2023", vehicles));
		vehicles.add(validateAllValidations("abc-126", "BMW", "Red", 500000, "12-05-2023", vehicles));
		vehicles.add(validateAllValidations("abc-127", "Hyundai", "Red", 500000, "12-05-2023", vehicles));
		vehicles.add(validateAllValidations("abc-1238", "Nissan", "Red", 500000, "12-05-2023", vehicles));
		vehicles.add(validateAllValidations("abc-129", "Honda", "Red", 500000, "12-05-2023", vehicles));
		return vehicles;
	}
}
