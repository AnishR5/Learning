package com.car;

public abstract class Car {
	
	private int modelno;
	private String colour;
	
	public abstract void speed();
	
	public Car()
	{
		modelno=101;
		colour="white";
	}
	
	public Car(int modelno,String colour)
	{
		this.modelno=modelno;
		this.colour=colour;
	}
	
	public Car display()   //covarient return datatype
	{
		return this;
	}
	
	@Override
	public String toString()
	{
		return "Modelno: "+this.modelno+" Colour:"+this.colour;
	}

}
