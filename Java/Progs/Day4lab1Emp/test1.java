package Day4lab1Emp;

public class test1 {

	public static void main(String[] args) {
		
		Employee e=new Salemgr();            //upcasting
		System.out.println(e.calNetSalary());
		System.out.println(e.getClass());
		
		e=new Tempworker();                  //upcasting
		System.out.println(e.calNetSalary());
		System.out.println(e.getClass());
		Object ref;
		ref=e;   //upcasting  method local variable
		
		System.out.println(ref.getClass());    //tempwork
		//ref.calNetSalary();     //javac checks by type of reference 
		System.out.println(((Employee)ref).calNetSalary());   //downcasting
		System.out.println(((Tempworker)ref).calNetSalary());
		if(ref instanceof Permworker)
			System.out.println(((Permworker)ref).calNetSalary());
		else
			System.out.println("not permworker");
	
	
	}

}
