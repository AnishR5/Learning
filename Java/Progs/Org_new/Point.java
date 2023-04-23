//1.1 Create a class Point2D ,    : for representing a point in x-y co-ordinate system.
//1.2 Create a parameterized constructor to init x & y co-ords.
//1.3 Add a method to return string form of  point's x & y co-ords
//Hint :  public String getDetails()) 
//1.4 Add isEqual method to Point2D class :a boolean returning method : must return true if both points are having same x,y co-ords or false otherwise.
//eg : public boolean isEqual(Point2D anotherPoint)
//{ .......}eg : p1.isEqual(p2)
//1.5 Add calculateDistance method to calculate distance between current point and specified point & return the distance to the caller.
//Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
//eg : public double calculateDistance(Point2D anotherPoint)
//{  Math.sqrt(.....);}
//1.6 Write TestPoint class    with a main method
//Accept co ordinates of 2 points from user (Scanner) --to create 2 points (p1 & p2)
//1.7 Use getDetails method to display point details.(p1's details & p2's details)
//1.8 Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same position)
//1.9 Display distance between p1 & p2


package com.BI;

public class Point {
	
	private int x,y;
	
	public Point()
	{
		x=0;
		y=0;
	}
	
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public int getx()
	{
		return this.x;
	}
	
	public int gety()
	{
		return this.y;
	}
	
	@Override
	public String toString()
	{
		return "(x,y):"+"("+x+","+y+")";
	}
	
	
	public boolean isEqual(Point p)
	{
		if(this.x==p.x && this.y==p.y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double calculatedistance(Point p)
	{
		double dist=Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));
		return dist;
	}
	

}
