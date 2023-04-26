package com.enume;

public enum colors {
white(1000),black(1200),red(900),purple(600),blue(1500);
	
	private int price;             //variable dec
	private colors(int price)     // private constructor,without this values cannot be assigned
	{
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return super.name();
	}

}
