package Tester;
import BlAssignment3.Person;
import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of persons");
		Person[] p=new Person[sc.nextInt()];
		int index=0;
		System.out.println("Menu:\n1.Create Account\n2.Get details\n3.Exit\nEnter choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter Name, age and city ");
			p[index]=new Person(sc.next(),sc.nextInt(),sc.next());
			index++;
		}
		case 2:
		{
			
		}
		}
	}

}
