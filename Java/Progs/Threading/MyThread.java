package Threading;

public class MyThread extends Thread{
	
	public MyThread(String name)
	{
		super(name);                     //custom name given or jvm give name to thread 
		System.out.println("Constructor invoked by: "+ getName()); //as it is extending thread ie it is a thread threfore no need of Thread.currentThread().getname() ;
		
	}
	
	
	@Override
	public void run()
	{
			System.out.println("Started "+ getName());
			try
			{
			
				for(int i=0;i<=10;i++)
				{
					System.out.println( getName() + " " +i);
					sleep(500);
				}
				System.out.println(getName() + "Over");
				
			}catch(Exception e)
			{
				System.out.println(getName() +" got exception "+ e);
			}
	}

}
