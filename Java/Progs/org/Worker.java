package com.app.org;

public class Worker extends Employee {
	private int hrsworked;
	private double hrsrate;
	
	public Worker()
	{
		super();
		hrsrate=0;
		hrsworked=0;
	}
	
	public Worker(String firstname,String lastname,int deptid,double basic,int hrsworked,double hrsrate)
	{
		super(firstname,lastname,deptid,basic);
		this.hrsworked=hrsworked;
		this.hrsrate=hrsrate;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+" Hrs Worked:"+hrsworked+" Hrs Rate"+hrsrate;
	}
	
	@Override
	public double calSalary()
	{
		super.netsalary=(super.basic+((this.hrsworked)*(this.hrsrate)));
		return super.netsalary;
	}
	
	public double gethrsrate()
	{
		return this.hrsrate;
	}

}
