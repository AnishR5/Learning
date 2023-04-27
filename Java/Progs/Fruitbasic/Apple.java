package com.app.fruit;

public class Apple extends Fruit
{
	public Apple(String name,String color,double weight)
	{
		super(name,color,weight);
	}
	
	@Override
	public String taste()
	{
		return "Sweet n Sour";
	}
	
	public void jam()
	{
		System.out.println("Name:"+getName()+"\nMaking Jam");
	}	
}
