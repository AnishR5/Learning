package Test;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Scanner;

import Core.Acctype;
import Core.BankAccount;
import CustomExcep.BankingException;
import Rules.validationrules;
import static Rules.validationrules.*;
import static Core.utils.populateBankacct;

public class testBankAccount {

	public static void main(String[] args) throws Exception {
		
		try(Scanner sc=new Scanner(System.in))
		{
				//HashMap<Integer, BankAccount> accounts = new HashMap<Integer, BankAccount>();
			HashMap<Integer, BankAccount> accounts =populateBankacct();
				boolean exit=false;
				
				while(!exit)
				{
				System.out.println("Menu:\n1.Create Account\n2.Display Accounts\n3.Bank Transfer\n4.Delete account\n5.Account Summary\nEnter choice ");	
				
				try {
					switch(sc.nextInt())
					{
					case 1:
					{
						System.out.println("Account types");
						for(Acctype a:Acctype.values())
						{
							System.out.println(a);
						}
						System.out.println("Enter Accno,name,balance, type, DOC(yyyy-mm-dd), lastTransdate");
						BankAccount acct=validateAll(sc.nextInt(),sc.next(),sc.nextDouble(),sc.next(),sc.next(),sc.next(),accounts);
						accounts.put(acct.getAccno(), acct);
						System.out.println("Account created");
					}break;//case1
					
					case 2:
					{
						System.out.println("Displaying all Accounts");
						for(BankAccount b:accounts.values())
						{
							System.out.println(b);
						}						
					}break;//case2
					
					case 3:
					{
						System.out.println("Enter senders acctno and receivers acctno,Amount ");
						BankAccount sender=accounts.get(sc.nextInt());
						if(sender==null)
							throw new BankingException("Sender acctid not found");
						BankAccount reciever=accounts.get(sc.nextInt());
						if(reciever==null)
							throw new BankingException("Reciever acctid not found");
						double amt= sc.nextInt();
						validateBalance(sender.getBalance()-amt);
						sender.BankTransfer(reciever,amt);
						System.out.println("Funds Transfered");
					}break;//case3
					
					case 4:
					
						System.out.println("Enter acctnumber");
						BankAccount b=accounts.get(sc.nextInt());
						if(b==null)
							throw new BankingException("Account not found");
						accounts.remove(b);
						System.out.println("Account deleted");
					break;//case4
					
					
					case 5:
					{
						//account summary
						System.out.println("Enter acctno");
						b=accounts.get(sc.nextInt());
						if(b==null)
							throw new BankingException("Account not found");
						System.out.println(b);
						
					}break;//case 5
					
					case 6:
					{
//						2.2 Display customer names having specified type of account (admin role)
//						i/p : account type
//						o/p : display names
						System.out.println("Enter account type");
						Acctype ty=Acctype.valueOf(sc.next().toUpperCase());
						for(BankAccount z:accounts.values())
						{
							if(z.getType()==ty)
								System.out.println(z);
						}
					}break;//case 6
					
					case 7:
					{
//						2.3 Modify  transfer funds operation :
//						If dest a/c is locked(in active) , restore the balance in the src account
//						System.out.println("Enter src a/c no , dest a/c no n transfer amount");
//						// get src a/c
						
						System.out.println("Enter senders acctno and recievers acctno");
						BankAccount sender=accounts.get(sc.nextInt());
						if(sender==null)
							throw new BankingException("Sender acctid not found");
						BankAccount reciever=accounts.get(sc.nextInt());
						if(reciever==null)
							throw new BankingException("Reciever acctid not found");
						if(sender.isActive() && reciever.isActive())
						{
							double amt= sc.nextInt();
							validateBalance(sender.getBalance()-amt);
							sender.BankTransfer(reciever,amt);
							System.out.println("Funds Transfered");
						}
						else
							throw new BankingException("Reciever or Senders account inactive");
							

					}break;
					
					case 8:
					{
						System.out.println("Enter rate,hand type of account info");
						double rate=sc.nextDouble();
						
						Acctype ty=Acctype.valueOf(sc.next().toUpperCase());
						for(BankAccount z:accounts.values())
						{
							if(z.getType()==ty)
							{
								LocalDate doc=z.getCreatedOn();
								double yrs=(Period.between(doc, LocalDate.now()).toTotalMonths())/12;
								System.out.println("Name: "+ z.getName()+"SI= "+rate*yrs*z.getBalance());
							}
						}
						
					}break;
					
					
					}//switch
					
				}//try
				catch(Exception e)
				{
					e.printStackTrace();
				}//catch
				
				}//while
				
				
		}//tryend
		
	}//mainend

}//classend
