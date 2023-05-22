package Th4;

public class test {

	public static void main(String[] args) {
		Display d=new Display();
	///	Display d2=new Display();
		MyThread t1=new MyThread(d, "one");
		MyThread  t2=new MyThread(d, "two");
		//MyThread  t2=new MyThread(d2, "two");
		t1.start();
		t2.start();
		
		
	}

}
