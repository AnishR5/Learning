package com.vehicleAl;

public enum Color {
	
	BLACK(20000),WHITE(0),GREY(10000),RED(5000),BLUE(1200);
	
	public double price;
	
	private Color(double price)
	{
		this.price=price;
	}
	
	@Override
	public String toString()
	{
		return name()+" Cost:"+price;
	}

}
