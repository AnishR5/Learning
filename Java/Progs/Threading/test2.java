package Threading;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getName() +" staretd");
		Mythread2 t=new Mythread2();
		
		Thread t1=new Thread(t, "one");
		Thread t2=new Thread(t, "two");
		Thread t3=new Thread(t, "three");
		Thread t4=new Thread(t, "four");
		t1.start();
		t2.start();
		t3.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName() + " Exec:" +i);
			Thread.sleep(700);
		}
		System.out.println(Thread.currentThread().getName()+" over");
	}

}
