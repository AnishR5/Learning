package Tester;
import com.car.*;
import java.util.Scanner;

public class testCar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Car[] c=new Car[5];
		int index=0;
		System.out.println("1)Create BMW\n2)Create Porshe\n3)Display");
		int ch;
		
		do {
			System.out.println("Enter choice:");
			ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println("Enter modelno,colour,airbags");
			c[index]=new Bmw(sc.nextInt(), sc.next(), sc.nextInt());
			System.out.println("Bmw created");
			index++;
		}break;
		case 2:
		{
			System.out.println("Enter modelno,colour,nos");
			c[index]=new Porshe(sc.nextInt(), sc.next(), sc.nextInt());
			System.out.println("Porsche created");
			index++;
		}break;
		case 3:
		{
			for(Car i:c)
			{
				if(i!=null) {
				System.out.println(i.display());
				if(i instanceof Bmw)
				{
					((Bmw)i).bmwFunc();
				}
				else if(i instanceof Porshe)
				{
					((Porshe)i).porshefun();
				}
				}
			}
		}break;
			
		}//switch
	}while(ch!=4);
		
	}

}
