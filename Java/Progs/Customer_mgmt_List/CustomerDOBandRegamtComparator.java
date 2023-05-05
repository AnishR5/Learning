package Customer_mgmt;

import java.util.Comparator;

public class CustomerDOBandRegamtComparator implements Comparator<Customer> {
	
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
