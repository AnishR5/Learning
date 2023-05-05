
//ServicePlan charges : 
//SILVER : 1000 
//GOLD : 2000
//DIAMOND : 5000
//PLATINUM : 10000
package Customer_mgmt;

public enum ServicePlan {
	PLATINUM(10000),DIAMOND(5000),GOLD(2000),SILVER(1000);	
	
	private double plancost;
	
	private ServicePlan(double plancost)
	{
		this.plancost=plancost;
	}

	public double getPlancost() {
		return plancost;
	}
	
	@Override
	public String toString()
	{
		return name()+" cost"+plancost;
	}
}
