package Th2;
import static java.lang.Thread.*;
public class test {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(currentThread().getName()+ " started");
		MyRunnable task=new MyRunnable();
		//task.start();
		//task.run();   no thread created run method will execute as a normal method
		Thread t=new Thread(task);
		
		//t.start();
		
//		Thread t1=new Thread(task, "one");
//		Thread t2=new Thread(task, "two");
//		Thread t3=new Thread(task, "three");
//		Thread t4=new Thread(task, "four");
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//		
//		for(int i=0;i<=10;i++)
//		{
//			System.out.println(currentThread().getName()+" exec "+i);
//			sleep(600);
//		}
		System.out.println(currentThread().getName()+" end..........");
	}

}
