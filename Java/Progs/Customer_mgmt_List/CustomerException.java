
package Customer_mgmt;

@SuppressWarnings("serial")
public class CustomerException extends Exception {
	
	private String errmgs;
	
	public CustomerException(String errmgs)
	{
		super(errmgs);
	}

}
