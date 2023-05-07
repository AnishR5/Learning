package Core;

import java.util.HashMap;

import static Rules.validationrules.validateAll;

public class utils {
	
	public static HashMap<Integer, BankAccount> populateBankacct() throws Exception
	{
		HashMap<Integer, BankAccount> acts=new HashMap<Integer, BankAccount>();
		acts.put(100, validateAll(100,"Anish",5000,"Savings","2000-08-23","2023-02-08",acts));
		acts.put(101, validateAll(101,"Rutvik",7000,"Current","2000-07-28","2023-04-28",acts));
		acts.put(102, validateAll(102,"Amit",8000,"FD","1996-09-08","2023-04-21",acts));
		acts.put(103, validateAll(103,"Kenil",10000,"Current","1998-07-28","2023-04-11",acts));
		acts.put(104, validateAll(104,"Bhavesh",9000,"Current","2000-07-28","2023-02-06",acts));
		acts.put(105, validateAll(105,"Janmejay",12000,"FD","2000-07-28","2023-04-12",acts));
		return acts;
		
	}

}
