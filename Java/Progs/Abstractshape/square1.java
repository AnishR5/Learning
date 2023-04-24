
public class square1 extends shape1 {
	
	private int length;
	
	public square1()
	{
		super();
		length=1;
	}
	
	public square1(int length)
	{
		super();
		this.length=length;
	}
	
	@Override
	public void display()
	{
		System.out.println("Display square");
	}
	
	@Override
	public void calArea()
	{
		super.setArea(this.length*this.length);
		System.out.println("Area of Square="+super.getArea());
	}

}
