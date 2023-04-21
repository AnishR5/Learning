import java.util.Scanner;

public class Arrayfreq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of the array: ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter elements in array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array1");
		for(int i:arr)
		{
			System.out.print(i+ " ");
		}
		
		System.out.println();
		int[]arr2=new int[size];
		
		for(int i=0;i<size;i++)
		{
			int count=0;
			for(int j=0;j<size;j++)
			{
				
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			arr2[i]=count;
		}
		
		System.out.println("Array");
		for(int i :arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------------");
		for(int i:arr2)
		{
			System.out.print(i+" ");
		}	

	}

}
