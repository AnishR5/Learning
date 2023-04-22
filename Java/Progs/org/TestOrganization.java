package Tester;
import com.app.org.Employee;
import com.app.org.Manager;
import com.app.org.Worker;
import java.util.Scanner;

public class TestOrganization {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Employee[] e= new Employee[5];
		int index=0;
		int choice=0;
		boolean b=false;
		
		do
		{
			System.out.println("Menu\n1.Create Manager\n2.Create Worker\n3.Display Details of all Employee\n4.Update\n5.Exit\nEnter choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				if(index<e.length)
				{
					System.out.println("Enter Firstname,lastname,Departmentid, Basic salary and Performance bonus");
					e[index]=new Manager(sc.next(),sc.next(),sc.nextInt(), sc.nextDouble(), sc.nextDouble());
					index++;
					System.out.println("Manager created\t ");
				}
				else
				{
					System.out.println("Array full");
				}
			}break;
			
			
			
			
			case 2:
			{
				if(index<e.length)
				{
					System.out.println("Enter firstname,lastname,departmentid, basic salary,hours worked and hours rate");
					e[index]=new Worker(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextInt(), sc.nextDouble());
					index++;
					System.out.println("Worker Created\t");
				}
			}break;
			
			
			case 3:
			{
				for(Employee i: e)
				{
					if(i!=null)
					{
					System.out.println(i);
					System.out.println("Net salary: "+i.calSalary());
					}
				}
			}break;
			
			
			
			case 4:
			{
				System.out.println("Enter empid");
				int key=sc.nextInt();
				for(int i=0;i<index;i++)
				{
					if(key==e[i].getEmpid())
					{
						b=true;
						System.out.println("To Update Basic salary enter amount");
						e[i].setBasic(sc.nextDouble());						
					}
				}
				if(b)
				{
					System.out.println("Invalid Empid!!!!");
				}
			}break;
			
			
			case 5:
			{
				System.out.println("Exiting Application................");
			}break;
			
			
			default:
			{
				System.out.println("Invalid Choice");
			}			
			}
		}while(choice!=5);
		
		
	}

}
