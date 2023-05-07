//1)parsedob 2)acctno 3)parseenum
package Rules;

import java.time.LocalDate;
import java.util.HashMap;

import Core.Acctype;
import Core.BankAccount;
import CustomExcep.BankingException;

public class validationrules {
	
private static final double MIN_Bal;
	
	static {
		MIN_Bal=5000;
	}
	
	
	public static BankAccount validateAll(int accno,String name, double balance, String type, String createdOn,String lastTransdate,HashMap<Integer, BankAccount> accts) throws Exception
	{
		validateAcctno(accno,accts);
		double bl=validateBalance(balance);
		Acctype validtype=parseandvalidateAcctype(type);
		LocalDate validDOC=parseandvalidateDOC(createdOn);
		LocalDate validtransdate=parseandvalidateTransdate(lastTransdate);
		//BankAccount validacct=new BankAccount(accno,name, balance, validtype, validdob,validtransdate);
		return new BankAccount(accno, name, bl, validtype, validDOC, validtransdate);
		
	}
	
	
	public static void validateAcctno(int acctno,HashMap<Integer, BankAccount> accts) throws BankingException
	{
		for(BankAccount b: accts.values())
		{
			if(b.getAccno()==acctno)
			{
				throw new BankingException("Duplicate Bank Account number");
			}
		}
	}
	
	public static Acctype parseandvalidateAcctype(String type) throws Exception 
	{
		Acctype validtype= Acctype.valueOf(type.toUpperCase());
		return validtype;
	}
	
	public static LocalDate parseandvalidateDOC(String createdOn) throws Exception
	{
		LocalDate validdate=LocalDate.parse(createdOn);
		return validdate;
	}
	
	public static LocalDate parseandvalidateTransdate(String transdate)
	{
		LocalDate validdate=LocalDate.parse(transdate);
		return validdate;
	}
	
	public static double validateBalance(double balance) throws BankingException
	{
		if(balance<MIN_Bal)
			throw new BankingException("Minimum balance limit reached");
		return balance;
	}
	
	
}
