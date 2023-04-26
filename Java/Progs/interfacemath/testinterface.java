package Tester;
import com.interfacemath.*;

public class testinterface {
	
//	public static void displayTotal(Myoperator m) 
//	{
//		m.addop(20, 30);
//	}
//	public static void displayTotal(Studentexam m) 
//	{
//		m.addop(20, 30);
//	}
	public static void displayTotal(Mathoperations m) 
	{
		m.addop(20, 30);
	}

	public static void main(String[] args) {
		Myoperator mobj1=new Myoperator();
		//mobj1.addop(25, 17);
		displayTotal(mobj1);
		System.out.println(mobj1.max(25, 17));
		
		Studentexam sobj1=new Studentexam();
		//sobj1.addop(98, 75);
		displayTotal(sobj1);
	}

}
