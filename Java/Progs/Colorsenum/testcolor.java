package Tester;
import com.enume.*;
import java.util.Scanner;

public class testcolor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		colors c1=colors.blue;
		System.out.println(c1);
		System.out.println(c1.ordinal());
		
		colors[] c=colors.values();
		for(colors i:c)
		{
			System.out.println(i+" Price:"+i.getPrice());
		}
		
		System.out.println("\n------------");
		System.out.println("Enter colour");
		colors c2=colors.valueOf(sc.next().toLowerCase());
		System.out.println("Selected color: "+c2+" Price:"+c2.getPrice());
		
	}


}
