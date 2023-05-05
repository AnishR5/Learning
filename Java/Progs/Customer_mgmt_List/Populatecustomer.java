package Customer_mgmt;

import java.util.ArrayList;
import java.util.List;
import static Customer_mgmt.Validationrules.validateAll;

public class Populatecustomer {
	
	public static ArrayList<Customer> populateCustomer() throws CustomerException
	{
		ArrayList<Customer> customers=new ArrayList<Customer>();
		customers.add(validateAll("Satish", "Gadhe", "satish@gmail.com", "preeti", "1998-07-14","Platinum",10000,"2023-03-21",customers));
		customers.add(validateAll("Sanket", "Joshi", "sanku@gmail.com", "reeti", "1995-11-24","Gold",2000,"2023-01-05",customers));
		customers.add(validateAll("Kapil", "Kanke", "kapil@gmail.com", "jamine", "1999-12-24","Silver",1000,"2023-02-04",customers));
		customers.add(validateAll("Kennel", "Versoya", "kenny@gmail.com", "lotus", "1998-08-05","Diamond",5000,"2023-04-01",customers));
		return customers;
	}

}
