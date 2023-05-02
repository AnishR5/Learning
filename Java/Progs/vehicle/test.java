//0. Prompt showroom capacity
//Create suitable array.
//Options
//1. Add Vehicle to the showroom.
//Accept data --validate all i/ps --in case of success -- add vehicle , to the showroom.
//o.w : throw custom exception
//2. Display all vehicle details

package com.vehicle;

import java.time.LocalDate;
import java.util.Scanner;
import static com.vehicle.ValidationRules.validateAllValidations;

public class test {

	public static void main(String[] args) {
	
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter capacity of showroom");
			Vehicle[] showroom=new Vehicle[sc.nextInt()];
			int ch;
			int index=0;
			boolean exit=false;
			while(!exit)
			{
				System.out.println("1.Add vehicle\n2.Display vehicles\n3.Exit");
				ch=sc.nextInt();
				try {
				switch(ch)
				{
				case 1:
				{
					if(index<showroom.length)
					{
						System.out.println("Available colors");
						for(Color c:Color.values())
						{
							System.out.println(c);
						}
						System.out.println();
						System.out.println("Enter chasisno,  company,  color,  baseprice,  mfgDate(dd-mm-yyyy)");
						Vehicle newv= validateAllValidations(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), showroom);
						showroom[index++]=newv;
						System.out.println("Vehicle Added");
					}
					else
						throw new VehicleInvalidException("Array Fulll!!!!!");
					
				}break;
				
				case 2:
				{
					System.out.println("All vehicle details");
					for(Vehicle v:showroom)
					{
						if(v!=null)
						{
							System.out.println(v);
						}
					}
				}
				
				case 3:
				{
					System.out.println("Exiting program..");
					System.exit(0);
				}
				
				}//switch
				}catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}//while
		}//try
		
		
		
	}

}
