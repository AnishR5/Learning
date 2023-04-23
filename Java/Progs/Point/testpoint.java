package Tester;

import java.util.Scanner;

import com.BI.Point;

public class testpoint {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Point1 x and y");
		Point p1=new Point(sc.nextInt(),sc.nextInt());
		System.out.println(p1);
		
		System.out.println("Enter Point2 x and y");
		Point p2=new Point(sc.nextInt(),sc.nextInt());
		
		int ch;
		do
		{
		System.out.println("Menu:\n1)Print points\n2)Distance between points\n3)Isequal\n4)Exit\nEnter choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println(p1);
			System.out.println(p2);
			break;
		}
		case 2:
		{
			System.out.println("Distance between two points is: ");
			System.out.println(p1.calculatedistance(p2));
			break;
		}
		case 3:
		{
			System.out.println("Points are equal:");
			System.out.println(p1.isEqual(p2));
			break;

		}
		case 4:
		{
			System.out.println("Exiting loop.....");
		}
		default:
			System.out.println("Enter valid choice");
		}
		}while(ch!=4);
		
		
		
		
	}

}
