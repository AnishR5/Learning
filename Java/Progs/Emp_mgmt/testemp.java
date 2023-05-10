package Emp_mgmt;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import static Emp_mgmt.emputils.*;
import static Emp_mgmt.validationrules.validateall;
import static Emp_mgmt.ioutil.*;

public class testemp {

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("ENter filename:");
			String filename=sc.next();
			Map<String, Employee> emap=restoreObjects(filename);
			//List<Employee> elist=populateemplist();
			boolean exit=true;
			System.out.println("0:exit 1: Hire new emp 2:List all emp  3:Promote 4:Delete  emp 5: Sort by join date");
			
			while(!exit)
			{
				System.out.println("Menu\n1)Hire new Employee");
				try
				{
				switch(sc.nextInt())
				{
				case 1:
				{
					System.out.println("Enter empid, fname, lname, dept, joindate, salary");
					Employee e=validateall(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), emap);
					emap.put(e.getEmpid(), e);
					System.out.println("Employee created");
				}break;
				
				case 2:
				{
					//2. List all emp details
					emap.values()
					.forEach(e->System.out.println(e));
					
				}break;
				
				case 3:
				{
					//3. Promote an emp
				}break;
				
				case 4:
				{
					//4. Delete emp details
					System.out.println("Enter empid to delete");
					String str=sc.next();
					emap.values().removeIf(e->e.getEmpid()==str);
					emap.values().forEach(e->System.out.println(e));
					
				}break;
				
				case 5:
				{
					//5. Sort emps as per join date n display the same.
					System.out.println("Sorted output");
					emap.values().stream()
					.sorted((e1,e2)->e1.getDoj().compareTo(e2.getDoj()))
					.forEach(e->System.out.println(e));
				}break;
				
				case 0:
				{	store(filename,emap);
					System.out.println("Exiting prog");
					exit=false;
				}break;
				
				}//switch
				}//try
				catch(Exception e)
				{
					e.printStackTrace();
				}//catch
			}//while
			
			
		}//try
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
