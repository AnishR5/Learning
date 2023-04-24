
public abstract class shape1 {
	
	private double area;
	
	public shape1()
	{
		area=0;
	}
	
	public void setArea(double exp)
	{
		this.area=exp;
	}
	
	public double getArea()
	{
		return this.area;
	}

	public abstract void calArea();           //Abstarct class
	
	public void display()
	{
		System.out.println("Shape display method");
	}
}
