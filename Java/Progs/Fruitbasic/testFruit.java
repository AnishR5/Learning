package Tester;
import java.util.Scanner;

import com.fruit.*;
public class testFruit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Fruit f1=new Mango(2, "yellow","alphanso" );
		System.out.println(f1.display());
		((Mango)f1).pulp();
		
		System.out.println();
		
		Fruit f2=new Orange(50, "Orange");
		System.out.println(f2.display());
		((Orange)f2).juice();
		
	}

}
