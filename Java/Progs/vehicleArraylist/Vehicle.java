//Objective : Showroom Management system , which will keep track of vehicles added in the showroom.
//Objective : Accept vehicle details : chasisNo(string) : Unique ID, color(enum) , basePrice(double)
//, manufactureDate(LocalDate),company,isAvailable
//Note : vehicle's base price will increase as per the chosen color
//Add  validation rules
//4.1 No dup vehicles should be added in the showroom : Later !
//4.2 manufactureDate : must be in current  year(eg : 1st Jan 2023 onwards)
//4.3 Vehicle color must be valid
//Create a Tester class
//Options
//1. Add Vehicle to the showroom.
//Accept data --validate all i/ps --in case of success -- add vehicle , to the showroom.
//o.w : throw custom exception

package com.vehicleAl;

import java.time.LocalDate;

public class Vehicle {

	private String chasisno, company;
	private Color color;
	private double baseprice;
	private LocalDate mfgDate;
	private double netprice;

	public Color getColor() {
		return color;
	}

	public String getChasisno() {
		return chasisno;
	}

	public Vehicle(String chasisno, String company, Color color, double baseprice, LocalDate mfgDate) {
		this.chasisno = chasisno;
		this.company = company;
		this.color = color;
		this.baseprice = baseprice;
		this.mfgDate = mfgDate;
	}

	public Vehicle(String chasisno) {
		this.chasisno = chasisno;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisno=" + chasisno + ", company=" + company + ", color=" + color + ", Netcost="
				+ baseprice + ", mfgDate=" + mfgDate + "]";
	}

	public double getNetprice() {
		return baseprice;
	}

	public void setNetprice(double netprice) {
		this.netprice = netprice;
	}

	public LocalDate getMfgDate() {
		return mfgDate;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Vehicle) {
			return this.chasisno.equals(((Vehicle) o).chasisno);
		}
		return false;
	}

	@Override
	public int compareTo(Vehicle othervehicle) {
		// System.out.println("in");
		return this.chasisno.compareTo(othervehicle.chasisno); // if 1>2 ie +ve then swap will happen
	}

}
