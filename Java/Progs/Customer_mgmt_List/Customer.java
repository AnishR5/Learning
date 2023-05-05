//customer id(int) ,first name, last name (string),email(string),password(string),
//registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)

//If time permits , in the combined lab itself, solve this
//In Customer class , add a field (instance var.) 
//private LocalDate lastSubscriptionPaidDate;
//Add Option(for customer) : Pay Subscription
//It should update the date.
//
//Add Option(for admin)  :  delete the customer details ,who have not paid the subscription(reg amount) for more than last 3  months 


package Customer_mgmt;

import java.time.LocalDate;

public class Customer implements Comparable<Customer>{
	
	private int customerid;
	private static int customeridcounter;
	private String fname,lname,email,password;
	private double registrationAmount;
	private  LocalDate dob;
	private ServicePlan plan;
	private LocalDate lastSubscriptionPaidDate;
	
	
	static
	{
		customeridcounter=1000;
	}

	public Customer(String fname, String lname, String email, String password, LocalDate dob,
			ServicePlan plan,double registrationAmount,LocalDate lastSubscriptionPaidDate) {
		super();
		this.customerid=customeridcounter++;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.plan = plan;
		this.registrationAmount=registrationAmount;
		this.lastSubscriptionPaidDate=lastSubscriptionPaidDate;
	}
	
	public String getPassword() {
		return password;
	}

	public Customer(String email)  //for verification (to beused along with equals) add overloaded ctor to wrap Primary key
	{
		this.email=email;
	}
	
	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+"Password: **********" + ",   registrationAmount=" + registrationAmount + ", dob=" + dob + ", plan="
				+ plan + "LastSubscriptionDate: "+lastSubscriptionPaidDate+"]";
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Customer)
			return this.email.equals(((Customer)o).email);
		return false;
	}
	
	@Override 
	public int compareTo(Customer othercustomer)
	{
		return this.email.compareTo(othercustomer.email);
	}

	public double getRegistrationAmount() {
		return registrationAmount;
	}

	public LocalDate getDob() {
		return dob;
	}
	
	public LocalDate getLastSubscriptionPaidDate() {
		return lastSubscriptionPaidDate;
	}

	public void setLastSubscriptionPaidDate(LocalDate lastSubscriptionPaidDate) {
		this.lastSubscriptionPaidDate = lastSubscriptionPaidDate;
	}

	
}
