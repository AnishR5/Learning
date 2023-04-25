package com.car;

public class Porshe extends Car {
	
	private int nos;
	
	public Porshe(int modelno,String colour,int nos)
	{
		super(modelno,colour);
		this.nos=nos;
	}
	
	@Override
	public void speed()
	{
		System.out.println("Speed:200 Km/hr");
	}
	
	@Override
	public Porshe display()       //covarient return datatype
	{
		return this;
	}
	
	@Override 
	public String toString()
	{
		return super.toString()+" NOS:"+this.nos;
	}
	
	public void porshefun()
	{
		System.out.println("Porshe special function");
	}
}
