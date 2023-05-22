package Th1;

public class MyThread extends Thread {

//	public MyThread(String name)
//	{
//		super(name);
//		System.out.println(getName()+" Constructor");
//	}
	
	@Override
	public void run()
	{
		System.out.println(currentThread().getName()+" Started");
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(currentThread().getName()+" exec "+i);
			try
			{
				sleep(500);
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		System.out.println(currentThread().getName()+" end......");
	}
}
