package Threading;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
			
		System.out.println("in MAin Method, main Thread details : " + Thread.currentThread().getName());
		
		MyThread t1= new MyThread("one");      //thread will not start unless thread is explicitly started
		MyThread t2= new MyThread("Two");
		MyThread t3= new MyThread("Three");
		MyThread t4= new MyThread("four");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println( Thread.currentThread().getName() + " " +i);
			Thread.sleep(600); 
			
		}	
		System.out.println("Main over");
		
	}

}
