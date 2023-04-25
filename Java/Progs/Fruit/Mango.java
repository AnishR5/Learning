package com.fruit;

public class Mango extends Fruit {
	
	private String mtype;
	
	public Mango(int weight,String colour,String mtype)
	{
		super(weight,colour);
		this.mtype=mtype;
	}
	
	@Override
	public Mango display()
	{
		return this;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+" Mtype:"+this.mtype;
	}
	
	public void pulp()
	{
		System.out.println("Mango pulp created");
	}
	
}
