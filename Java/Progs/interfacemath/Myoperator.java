package com.interfacemath;

public class Myoperator implements Mathoperations {
	
	
	@Override
	public void addop(int i, int j) {
		System.out.println("Addition= "+(i+j));
	}
	
	public void display()
	{
		System.out.println("inside myoperator method");
	}

	

}