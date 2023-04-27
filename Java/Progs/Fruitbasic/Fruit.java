package com.fruit;

public class Fruit {
	private double weight;
	private String colour;
	
	public Fruit(double weight,String colour)
	{
		this.weight=weight;
		this.colour=colour;
	}
	
	public Fruit display()
	{
		return this;
	}
	
	@Override 
	public String toString()
	{
		return "Weight: "+this.weight+" Colour:"+this.colour;
	}
}
