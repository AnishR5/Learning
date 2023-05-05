//signup
//sign in
//change pass
//unsubscribe
//display all cutomers
package Customer_mgmt;

import static Customer_mgmt.Populatecustomer.populateCustomer;
import java.time.LocalDate;
import static Customer_mgmt.Validationrules.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class testcustomer {

	public static void main(String[] args) throws CustomerException {

		try (Scanner sc = new Scanner(System.in)) {
			// List<Customer> Customerlist = new ArrayList<>();
			List<Customer> Customerlist = populateCustomer();

			boolean exit = false;
			while (!exit) {

				System.out.println("Menu:\n1.Signup\n2.Signin\n3.Change Password\n4.Unsubscribe plan\n5.Display\n6.Sort by email\n7.Sort by DOB\n8.Pay bill\n9.Remove customers(Unpaid bills)");
				System.out.println("Enter choice");
				try {
					switch (sc.nextInt()) {
					case 1: {
						System.out.println("Available Plans:");
						for (ServicePlan s : ServicePlan.values()) {
							System.out.println(s);
						}
						System.out.println();
						System.out.println("Enter fname,lname,email,password,dob(yyyy-mm-dd),plan,registrationAmount,lastSubscriptionPaidDate");
						Customer ctemp = validateAll(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(),sc.next(), Customerlist);
						Customerlist.add(ctemp);
						System.out.println("Account generated");
					}
						break;// case 1

					case 2: {
						// signin
						System.out.println("Enter email and password");
						login(sc.next(), sc.next(), Customerlist);

					}
						break;

					case 3: {
						// change password
						System.out.println("Enter email and password");
						Customer ctemp = login(sc.next(), sc.next(), Customerlist);
						System.out.println("Enter new Password");
						ctemp.setPassword(sc.next());
						System.out.println("Password Updated ");
					}
						break;

					case 4: {
						// unsubscribe
						System.out.println("Enter email and password");
						Customer ctemp = login(sc.next(), sc.next(), Customerlist);
						Iterator<Customer> itr = Customerlist.iterator();
						while (itr.hasNext()) {
							if (itr.next().getEmail().equals(ctemp.getEmail())) {
								itr.remove();
							}
						}
						System.out.println("Unsubscribe Complete");

					}break;
						

					case 5: {
						for (Customer c : Customerlist) {
							System.out.println(c);
						}
					}break;
					
					case 6: 
					{
						Collections.sort(Customerlist);
						System.out.println("Sorted completed");
					}break;
					
					case 7:
					{
						//Collections.sort(Customerlist, new CustomerDOBandRegamtComparator());
						Collections.sort(Customerlist, new Comparator<Customer>() {
							@Override
							public int compare(Customer c1,Customer c2)
							{
								int ret=c1.getDob().compareTo(c2.getDob());
								if(ret==0)
								{
									if(c1.getRegistrationAmount()>c2.getRegistrationAmount())
										return 1;
									if(c1.getRegistrationAmount()==c2.getRegistrationAmount())
										return 0;
									return -1;
								}
								return ret;
							}
						}
						
						);
						System.out.println("Sorting Completed ");
						
					}break;
					
					case 8:
					{
						System.out.println("Enter login details email and password");
						Customer cust=login(sc.next(), sc.next(), Customerlist);
						Iterator<Customer> itr=Customerlist.iterator();
						while(itr.hasNext())
						{
							Customer ctemp=itr.next();
							if(ctemp.getEmail()==cust.getEmail())
							{
								ctemp.setLastSubscriptionPaidDate(LocalDate.now());
							}
						}
						System.out.println("lastSubscriptionPaidDate Updated");
					}break;
					
					
					case 9:
					{
						System.out.println("Removing customer whose unpaid bill > 3 months");
						removeCustomerofunpaidbill(Customerlist);
						
					}break;
					
					}//switch

				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine(); // read off pending token from Scanner
				} // catch
			}

		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}

}
