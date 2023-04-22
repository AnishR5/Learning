package com.app.org;

public class Manager extends Employee {
private double perfbonus;
	
	public Manager()
	{
		super();
		perfbonus=0;
	}
	
	public Manager(String firstname,String lastname,int deptid,double basic,double perfbonus)
	{
		super(firstname,lastname,deptid,basic);
		this.perfbonus=perfbonus;
	}
	
	@Override
	public double calSalary()
	{
		super.netsalary=(super.basic+this.perfbonus);
		return super.netsalary;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+" Perf Bonus "+perfbonus;
	}
	
	public double getPerfbonus()
	{
		return perfbonus;
	}
	
	public void decision()
	{
		System.out.println("----------make decision------------");
	}

}
