package com.app.fruit;

public class Mango extends Fruit
{
	public Mango(String name,String color,double weight)
	{
		super(name,color,weight);
	}
	
	@Override
	public String taste()
	{
		return "Sweet";
	}
	
	public void pulp()
	{
		System.out.println("Name:"+getName()+" Color:"+getColor()+"\nCreating Pulp");
	}	
}

