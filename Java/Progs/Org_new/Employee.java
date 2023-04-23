//1.1 Emp state--- id(int), name, deptId , basicSalary(double)
//Accept all of above in constructor arguments.
//Methods ---1.To  get emp details -- override toString((inherited from Object class)
//1.2. compute net salary ---ret 0
//(eg : public double computeNetSalary(){return 0;})

package com.app.org;

public class Employee {
	
	private int empno,deptno;
	private String name;
	private double basicsal;
	
	public Employee()
	{
		empno=0;
		deptno=0;
		name="abc";
		basicsal=100;
	}
	
	public Employee(int empno,int deptno,String name,double basicsal)
	{
		this.empno=empno;
		this.deptno=deptno;
		this.name=name;
		this.basicsal=basicsal;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicsal() {
		return basicsal;
	}

	@Override
	public String toString()
	{
		return "Empno:"+empno+" deptno:"+deptno+" Name: "+name+" Salary: "+basicsal;
	}
	
	public double calnetsal()
	{
		System.out.println("Employee sall");
		return 0;
	}
	

}
