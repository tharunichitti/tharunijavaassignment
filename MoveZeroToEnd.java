package javaAssignment;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		int count=0;

		int arr[] = {9,0,7,4,3,0,0,8};
		int n = arr.length;


		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0) 
			{
				arr[count++]=arr[i];
			}
			
		}
		while(count<n)
		{
			arr[count++]=0;
			
		}
		System.out.println("Array After moving all 0's to end-");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+"");
			
		}

	}

}
