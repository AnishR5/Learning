package com.vehicleAl;

import static com.vehicleAl.ValidationRules.validateAllValidations;

import java.util.ArrayList;

public class populatedvehicles {

	public static ArrayList<Vehicle> addpopvehicles() throws VehicleInvalidException {
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(validateAllValidations("abc-123", "Hyundai", "Red", 500000, "01-05-2023", vehicles));
		vehicles.add(validateAllValidations("abc-133", "Mercedes", "White", 500000, "28-03-2023", vehicles));
		vehicles.add(validateAllValidations("abc-124", "Hyundai", "Grey", 500000, "08-11-2023", vehicles));
		vehicles.add(validateAllValidations("abc-125", "Honda", "Grey", 500000, "04-06-2023", vehicles));
		vehicles.add(validateAllValidations("abc-126", "BMW", "Red", 500000, "19-02-2023", vehicles));
		vehicles.add(validateAllValidations("abc-127", "Hyundai", "White", 500000, "29-07-2023", vehicles));
		vehicles.add(validateAllValidations("abc-1238", "Nissan", "Blue", 500000, "21-01-2023", vehicles));
		vehicles.add(validateAllValidations("abc-129", "Honda", "Red", 500000, "12-05-2023", vehicles));
		return vehicles;
	}
}
