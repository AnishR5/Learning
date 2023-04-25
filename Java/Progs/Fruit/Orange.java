package com.fruit;

public class Orange extends Fruit{
	
	public Orange(int weight,String colour)
	{
		super(weight,colour);
	}
	@Override
	public Orange display()
	{
		return this;
	}
	
	public void juice()
	{
		System.out.println("Orange juice created");
	}
	
//	@Override
//	public String toString()
//	{
//		return super.toString();
//	}
}
