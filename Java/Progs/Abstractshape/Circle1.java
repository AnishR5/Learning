
public class Circle1 extends shape1 {
	
	private int radius;
	
	public Circle1(int radius)
	{
		super();
		this.radius=radius;
	}
	
	@Override 
	public void calArea()
	{
		super.setArea(3.14*radius*radius);
		System.out.println("Area of Circle="+super.getArea());
	}

}
