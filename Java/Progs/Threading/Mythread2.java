package Threading;

public class Mythread2 implements Runnable {
	
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName() +" Started");
		
		try {
			
			for(int i=0;i<=10;i++)
			{
				System.out.println(Thread.currentThread().getName() + " Exec:" +i);
				Thread.sleep(500);
			}
			System.out.println(Thread.currentThread().getName()+" over");
		}catch(Exception e)
		{
			System.out.println(Thread.currentThread().getName()+" Exception"+e);
		}
	}

}
