package Tester;
import com.Bankenum.*;
import java.util.Scanner;

public class testBankenum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int index=0;
		BankAct[] b=new BankAct[5];
		int ch;
		System.out.println("1.Create Account\n2.Display Account\n3.Add locker\n4.Exit");
		do {
			System.out.println("Enter choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("Types of Bank Accounts");
				for(Actype i:Actype.values())
				{
					System.out.println(i);
				}
				System.out.println("Enter name,Balance,Account type,DOB(dd/mm/yyyy)");
				b[index]=new BankAct(sc.next(),sc.nextDouble(), Actype.valueOf(sc.next().toLowerCase()), new Date(sc.nextInt(), sc.nextInt(), sc.nextInt()));
				System.out.println("Account created");
				System.out.println("Do you want to create locker(y/n)");
				char ans=sc.next().charAt(0);
				if(ans=='y')
				{
					System.out.println("Enter Duration(months)");
					b[index].createlocker(sc.nextInt());
					System.out.println("Locker created\n"+b[index].getLocker());
				}
				System.out.println("Acctid:"+b[index].getAcctid());
				index++;
			}break;  //end case1
			
			case 2:
			{
				System.out.println("Enter acctid");
				int key=sc.nextInt();
				boolean flag=false;
				for(int i=0;i<index;i++)
				{
					if(b[i].getAcctid()==key)
					{
						System.out.println(b[i]);
						flag=true;
					}
				}
				if(flag==false)
				{
					System.out.println("Acctid doesnt exists");
				}
			}break;
			
			case 3:
			{
				System.out.println("To create locker Enter acctid");
				int key=sc.nextInt();
				boolean flag=false;
				for(int i=0;i<index;i++)
				{
					if(b[i].getAcctid()==key)
					{
						flag=true;
						if(b[i].getLocker()==null)
						{
						System.out.println("Enter duration of locker");
						b[i].createlocker(sc.nextInt());
						System.out.println("Locker created\n"+b[i].getLocker());
						}
						else
						{
							System.out.println("Locker already exists\n"+b[i].getLocker());
						}
					}
				}
				if(flag==false)
				{
					System.out.println("Acctid doesnt exist");
				}
			}break;
			
			case 4:
			{
				System.out.println("Exiting application..........");
			}
			
			default:
				System.out.println("Invalid choice");
			
			}//switch end
		}while(ch!=4);
			
			
			
			
//		System.out.println("Types of Bank Accounts");
//		for(Actype i:Actype.values())
//		{
//			System.out.println(i);
//		}
//		//System.out.println();
//		System.out.println("Enter name,Balance,Account type,DOB(dd/mm/yyyy)");
//		BankAct b=new BankAct(sc.next(),sc.nextDouble(), Actype.valueOf(sc.next().toLowerCase()), new Date(sc.nextInt(), sc.nextInt(), sc.nextInt()));
//		System.out.println("Account created");
//		System.out.println("Do you want to create locker(y/n)");
//		char ans=sc.next().charAt(0);
//		//System.out.println(ans);
//		if(ans=='y')
//		{
//			System.out.println("Enter Duration(months)");
//			b.createlocker(sc.nextInt());
//		}
		//--------------------------------------------------
//		System.out.println("Account details");
//		System.out.println(b);
		
	}

}
