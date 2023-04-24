
public class Rectangle1 extends shape1 {
	
	public int length,breadth;
	
	public Rectangle1()
	{
		super();
		length=1;
		breadth=1;
	}
	
	public Rectangle1(int length,int breadth)
	{
		super();
		this.length=length;
		this.breadth=breadth;
	}
	
	@Override
	public void calArea()
	{
		super.setArea(length*breadth);
		System.out.println("Area of Rectangle="+super.getArea());
	}
		

}
