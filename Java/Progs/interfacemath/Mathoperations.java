package com.interfacemath;

public interface Mathoperations {
	void addop(int i,int j);
	default int max(int i,int j)
	{
		if(i>j)
		{
			return i;
		}
		else
			return j;
	}

}
