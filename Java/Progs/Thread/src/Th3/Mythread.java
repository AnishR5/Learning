package Th3;

public class Mythread extends Thread {
	@Override
	public void start()
	{
		super.start();
		System.out.println("start Method");
	}
	
	@Override
	public void run()
	{
		System.out.println("run method");
	}

}
