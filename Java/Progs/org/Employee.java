package com.app.org;

public class Employee {
	
	private String firstname,lastname;
	private int empid,deptid;
	protected double basic;
	private static int idcounter;
	protected double netsalary;
	
	static {
		idcounter=1000;
	}
	
	public Employee()
	{
		idcounter++;
		firstname="xyz";
		lastname="abc";
		deptid=999;
		basic=000;
		empid=idcounter;
	}
	
	public Employee(String firstname,String lastname,int deptid,double basic)
	{
		idcounter++;
		this.firstname=firstname;
		this.lastname=lastname;
		this.deptid=deptid;
		this.basic=basic;
		this.empid=idcounter;
	}
	
	public double calSalary()
	{
			this.netsalary=basic;
			return this.netsalary;
	}
	
	@Override
	public String toString()
	{
		return "Name-"+firstname+"  "+lastname+"  Empid: "+empid+" Deptid: "+deptid+" Basic Salary: "+basic;
	}
	
	public int getEmpid()
	{
		return this.empid;
	}
	
	public void setBasic(double amount)
	{
		this.basic=amount;
		System.out.println("Updated Basic Salary: "+this.basic);
	}

}
