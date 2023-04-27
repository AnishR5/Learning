import java.util.Scanner;

public class secondlast {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="Hi, Everyone how are you";
		System.out.println(s.length());
		System.out.println(s);
		System.out.println("Enter a character:");
		char key=sc.next().charAt(0);
		//System.out.println(key);
		int count=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)==key)
			{
				count++;
			}
			if(count==2)
			{
				System.out.println("Index "+i);
				break;
			}
			
		}
		
		if(count==1)
		{
			System.out.println("char Occured only once");
		}
		else if(count==0)
		{
			System.out.println("Char not present");
		}
		
	}

}
