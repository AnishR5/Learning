//1.3 Worker state  --id,name,basic,deptId,hoursWorked,hourlyRate
//Methods : 
//1. get worker details -- :  override toString. (inherited from Emp class)
//2.  compute net salary (formula:  = basic+(hoursWorked*hourlyRate) --override computeNetSalary
//3. get hrlyRate of the worker  -- add a new method to return hourly rate of a worker.(getter)

package com.app.org;

public class Worker extends Employee {
	
	private int hrsworked;
	private double hrsrate;
	
	public Worker()
	{
		super();
		hrsworked=10;
		hrsrate=200;
	}
	
	public Worker(int empno,int deptno,String name,double basicsal,int hrsworked,double hrsrate)
	{
		super(empno,deptno,name,basicsal);
		this.hrsworked=hrsworked;
		this.hrsrate=hrsrate;
	}
	
	public double gethrsrate()
	{
		return hrsrate;
	}
	
	@Override
	public double calnetsal()
	{
		System.out.println("----Worker sal");
		return super.getBasicsal()+this.hrsrate*this.hrsworked;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+" Hrs worked: "+hrsworked+" Hrs Rate: "+hrsrate;
	}
	
	

}
