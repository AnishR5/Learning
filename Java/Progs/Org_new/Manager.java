//1.2 Mgr state  ---id,name,basic,deptId , perfBonus
//Add suitable constructor
//Methods ----1. get mgr details :  override toString (inherited from Emp class)
//1. compute net salary (formula: basic+perfBonus) -- override computeNetSalary
//2. get performance bonus. --add a new method to return bonus.(getter)

package com.app.org;

public class Manager extends Employee{
	
	private double perfbonus;
	
	public Manager()
	{
		super();
		perfbonus=0;
	}
	
	public Manager(int empno,int deptno,String name,double basicsal,double perfbonus)
	{
		super(empno,deptno,name,basicsal);
		this.perfbonus=perfbonus;
	}
	
	public double getPerfbonus()
	{
		return perfbonus;
	}
	
//	public void getPerfbonus()
//	{
//		System.out.println(perfbonus);
//	}
	@Override
	public String toString()
	{
		return super.toString()+" Perfbonus: "+perfbonus;
	}
	
	@Override
	public double calnetsal()
	{
		System.out.println("-------Manager sal");
		return (super.getBasicsal()+this.perfbonus);
		
	}
	
	

}
