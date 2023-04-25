package com.car;

public class Bmw extends Car {
	
	private int airbags;
	
	public Bmw(int modelno,String colour,int airbags)
	{
		super(modelno,colour);
		this.airbags=airbags;
	}
	
	@Override
	public void speed()
	{
		System.out.println("Speed=240Km/hr");
	}
	
	@Override
	public Bmw display()   //covarient return datatype
	{
		return this;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+" Airbags:"+this.airbags;
	}
	
	public void bmwFunc()
	{
		System.out.println("Bmw specialfun");
	}
	

}
