package pattern;

import java.util.Scanner;

//    1
//   232
//  34543
// 4567654
//567898765

public class exampattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=r-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=2*i-1;k++)
			{
				System.out.print(k);
			}
			for(int l=2*i-2;l>=i;l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}

}
