import java.util.Scanner;

public class Arrayaddelement {
	
	public void insertElementatstart(int arr[],int val)
	{
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=val;
	}
	
	public void insertElementlast(int arr[],int value)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arr[i]=value;
				break;
			}
		}
	}
	
	public void inserteleatposition(int arr[],int position,int value)
	{
		for(int i=arr.length-1;i>position;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[position]=value;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Arrayaddelement a =new Arrayaddelement();
		int[] arr =new int[6];
		arr[0]= 4;
		arr[1]=7;
		arr[2]=2;
		arr[3]=9;
		arr[4]=53;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		System.out.println();
		
		System.out.println("1.Enter element at first position\n2.At given position\n3.At last position\nEnter choice");
		switch(sc.nextInt())
		{
		case 1:
			System.out.println("Enter the element at first position");
			a.insertElementatstart(arr,sc.nextInt());
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=0)
				{
					System.out.print(arr[i]+" ");
				}
			}
			break;
		
		case 2:
			System.out.println("Enter the position and element ");
			a.inserteleatposition(arr, sc.nextInt()	, sc.nextInt());
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=0)
				{
					System.out.print(arr[i]+" ");
				}
			}
			break;
			
		case 3:
			System.out.println("Enter the element at first position");
			a.insertElementlast(arr, sc.nextInt());
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=0)
				{
					System.out.print(arr[i]+" ");
				}
			}
			break;
		}	
	}

}
