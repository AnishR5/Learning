//Depending on the plan chosen , customer will have to pay specific registration amount

//customer id should be system generated , using auto increment.
//Unique ID(Primary Key ) : email  (2 customers are SAME iff their email ids are same)
//After reading above , can you create a Customer class ?
//Try it !

//1)registration amt
//2)age>21
//3)no dup customer
//4)parse enum


//signup
//sign in
//change pass
//unsubscribe
//display all cutomers
package Customer_mgmt;
import java.security.Provider.Service;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Validationrules {
	
	
	public static Customer validateAll(String fname, String lname, String email, String password, String dob,
			String plan,double registrationAmount,String lastSubscriptionPaidDate,List<Customer> customers) throws CustomerException
	{
		Validateemail(email, customers);
		ServicePlan selectedplan=parseandvalidatePlan(plan, registrationAmount);
		LocalDate dob1=parseandvalidateDOB(dob);
		LocalDate subsdate=parseandvalidatesubsdate(lastSubscriptionPaidDate);
		return new Customer(fname, lname, email, password, dob1, selectedplan, registrationAmount,subsdate);
	}
	
	public static void Validateemail(String email,List<Customer> customerlist) throws CustomerException
	{
		Customer newcust=new Customer(email);
			if(customerlist.contains(newcust))
			{
				throw new CustomerException("Duplicate Email id");
			}
			System.out.println("No duplicate email found");
	}
	
//	public static ServicePlan parseandvalidatePlan(String plan) throws IllegalArgumentException
//	{
//		return ServicePlan.valueOf(plan.toUpperCase());
//	}
	
	
	public static ServicePlan parseandvalidatePlan(String plan,double regisamt) throws CustomerException 
	{
		ServicePlan serviceplan=ServicePlan.valueOf(plan.toUpperCase());
		if(serviceplan.getPlancost()!=regisamt)
		{
			throw new CustomerException("Invalid Reg Amount for chosen plan");
		}
		System.out.println("correct serviceplan");
		return serviceplan;
	}
	
	public static LocalDate parseandvalidateDOB(String dob) throws CustomerException
	{
		LocalDate tdob=LocalDate.parse(dob);
		int p=Period.between(tdob, LocalDate.now()).getYears();
		if(p<21)
		{
			throw new CustomerException("Under Age!! Apply after completing 21 years");
		}
		System.out.println("Correct DoB");
		return tdob;
	}
	
	public static LocalDate parseandvalidatesubsdate(String date)
	{
		return LocalDate.parse(date);
	}
	
	public static Customer login(String email,String password,List<Customer> customers) throws CustomerException
	{
		Customer ctemp=new Customer(email);
		int index=customers.indexOf(ctemp);
		if(index==-1)
		{
			throw new CustomerException("Invalid Email or password");
		}
		Customer validcustomer=customers.get(index);
		if(validcustomer.getPassword().equals(password))
		{	
			System.out.println("Login Successfull!!!!");
			return validcustomer;
		}
		else
		{	
			throw new CustomerException("Invalid Email or password");
		}
		
	}
	
	public static void removeCustomerofunpaidbill(List<Customer> customers)
	{
		Iterator<Customer> itr=customers.iterator();
		while(itr.hasNext())
		{
			Customer c=itr.next();
			long months=Period.between(c.getLastSubscriptionPaidDate(), LocalDate.now()).toTotalMonths();
			System.out.println("Total months of unpaid subscription: "+months+" Customer email: "+c.getEmail() +"Last Subscription date"+c.getLastSubscriptionPaidDate());
			if(months>=3)
			{
				itr.remove();
			}
		}
	}
	
	
	
	
}
