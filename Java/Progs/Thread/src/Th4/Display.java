package Th4;
import static java.lang.Thread.*;
public class Display {
	
	public synchronized void wish(String name)
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Good morning: "+name);
			try {
			sleep(500);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}

}
