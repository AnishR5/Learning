//5.2 Properties (instance variables)  : color : String , weight : double , name:String, 
//fresh : boolean

package com.app.fruit;

public abstract class Fruit {
	private String name,color;
	private double weight;
	private boolean fresh;
	
	public Fruit(String name,String color,double weight)
	{
		this.name=name;
		this.color=color;
		this.weight=weight;
		fresh=true;
	}
public abstract String taste();
	
	public String getName()
	{
		return this.name;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	public String getColor()
	{
		return this.color;
	}
	public boolean isFresh()
	{
		return this.fresh;
	}
	
	public void setStale() {
		this.fresh = false;
	}
	@Override
	public String toString()
	{
		return "Name:"+name+" Weight:"+weight+" Color:"+color;
	}

}


