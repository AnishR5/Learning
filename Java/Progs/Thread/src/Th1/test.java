package Th1;

import static java.lang.Thread.*;

public class test {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(currentThread().getName()+" started");
		
		MyThread t=new MyThread();
		System.out.println(t.getName());
		//System.out.println(currentThread().getName());
	//	currentThread().setName("Anish's Thread");
		t.setName("Anish's Thread");
		//System.out.println(currentThread().getName());
		System.out.println(t.getName());
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
//		MyThread t1=new MyThread("one");
//		MyThread t2=new MyThread("two");
//		MyThread t3=new MyThread("three");
//		MyThread t4=new MyThread("four");
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//		
//		for(int i=0;i<=10;i++)
//		{
//			System.out.println(currentThread().getName()+" exec "+i);
//			sleep(700);
//		}
		System.out.println("main exit...............");
	}

}
