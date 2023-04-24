import java.util.Scanner;

public class Testshape1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		shape1[] s=new shape1[5];
		
		System.out.println("Enter length of square");
		s[0]=new square1(sc.nextInt());
		s[0].calArea();
		
		System.out.println("Enter length and breadth of rectangle");
		s[1]=new Rectangle1(sc.nextInt(),sc.nextInt());
		s[1].calArea();
		
		System.out.println("Enter radius of circle");
		s[2]=new Circle1(sc.nextInt());
		s[2].calArea();
		
	}

}
