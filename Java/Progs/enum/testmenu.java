package Tester;
import java.util.Scanner;

import com.enume.*;

public class testmenu {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Menus []m=Menus.values();
		for(Menus i:m)
		{
			System.out.println(i);
		}
		System.out.println("--------------------------");
		
		System.out.println("Enter menu");
		Menus m1=Menus.valueOf(sc.next().toLowerCase());
		System.out.println("You have entered "+m1);
		
		switch(m1)
		{
		case tea:
		{
			System.out.println("cost=Rs20");
		}break;
		case coffee:
		{
			System.out.println("cost=Rs30");
		}
			
		}//case
		
		
		
	}

}
