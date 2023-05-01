package Bankact;

public class testBank {

	public static void main(String[] args) {
		Object ac1=new Bankacct(1001, 25000, "Satish Seth", "Saving");
		Object ac2=new Bankacct(1001, 25000, "Satish Seth", "Saving");
		System.out.println(ac1==ac2);
		System.out.println(ac1.equals(ac2));
		
		Object o=100;  //Auto boxing
		System.out.println(o.getClass());
		System.out.println(ac1.equals(o));
		
	}

}
