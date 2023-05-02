//0. Prompt showroom capacity
//Create suitable array.
//Options
//1. Add Vehicle to the showroom.
//Accept data --validate all i/ps --in case of success -- add vehicle , to the showroom.
//o.w : throw custom exception
//2. Display all vehicle details

package com.vehicleAl;

import static com.vehicleAl.ValidationRules.validateAllValidations;
import static com.vehicleAl.populatedvehicles.addpopvehicles;
import static com.vehicleAl.ValidationRules.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws VehicleInvalidException {
	
		try(Scanner sc=new Scanner(System.in))
		{
			//System.out.println("Enter capacity of showroom");
			//Vehicle[] showroom=new Vehicle[sc.nextInt()];
			ArrayList<Vehicle> showroom=addpopvehicles();
			int ch;
			//int index;
			boolean exit=false;
			while(!exit)
			{
				System.out.println("1.Add vehicle\n2.Display vehicles\n3.Display details of Specific Vehicle\n4.Discount\n5.Delete Vehicle");
				ch=sc.nextInt();
				try {
				switch(ch)
				{
				case 1:
				{
//					if(index<showroom.length)
//					{
						System.out.println("Available colors");
						for(Color c:Color.values())
						{
							System.out.println(c);
						}
						System.out.println();
						System.out.println("Enter chasisno,  company,  color,  baseprice,  mfgDate(dd-mm-yyyy)");
						Vehicle newv= validateAllValidations(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), showroom);
						//showroom[index++]=newv;
						showroom.add(newv);
						System.out.println("Vehicle Added");
//					}
//					else
//						throw new VehicleInvalidException("Array Fulll!!!!!");
					
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
				}break;
				
				case 3:
				{
//					Option : get specific vehicle details
//					i/p : chasis no
//					o/p : either vehicle details (in case of vehicle found) or err mesg via custom exc!
//					Hint : search criteria : PK based --methods exist
//					indexOf -- -1 => not found --throw custom exc
//					get(index) --elem
					int index;
					System.out.println("Enter chasisno.");
					Vehicle vtemp=new Vehicle(sc.next());
					index=showroom.indexOf(vtemp);
					if(index==-1)
					{
						throw new VehicleInvalidException("Chasisno not found!!!");
					}
					else
						System.out.println(showroom.get(index));	
				}break;//case 3
				
				case 4:
				{
//					Apply discount on all vehicles produced before a specific date
//					i/p : date , discount
//					Hint : search criteria --non PK based (date)
//					for-each(Iterator) ---parse n validate date --- isBefore -- reduce price
					
					System.out.println("Enter Date(y-m-d) and discount");
					LocalDate d1=LocalDate.parse(sc.next());
					double disc=sc.nextDouble();
					for(Vehicle v:showroom)
					{
						if(v.getMfgDate().isBefore(d1));
						{
							v.setNetprice(v.getNetprice()-disc);
							System.out.println("New netprice of "+v.getChasisno()+"="+v.getNetprice());
						}
					}
					System.out.println("disc applied");
				}break;//case4
				
				case 5:			
				{
					//delete vehicle with chasis num given
					System.out.println("Enter chasis number");
					Vehicle vtemp=new Vehicle(sc.next());
					int index=showroom.indexOf(vtemp);
					System.out.println("Removed obj"+showroom.remove(index));
				}break;//case 5
				
				
				case 6:
				{//remove vehicle with entered color
					System.out.println("Enter colour");
					Color selclr=parseandvalidatecolor(sc.next());
					for(Vehicle v:showroom)
					{
						if(v.getColor()==selclr)
						{
							System.out.println("Removed color: "+showroom.remove(v));
						}
					}
				}break;
				
				}//switch
				}catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}//while
		}//try
		
		
		
	}

}
