
public class retestarray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int[] sum=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			int s=0;
			for(int k=0;k<arr.length;k++)
			{
				s=s+arr[k]*k;
			}
			sum[i]=s;
			
			int last=arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];			
			}
			arr[0]=last;
			
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i:sum)
		{
			System.out.print(i+" ");
		}
	
		
	}

}
