package com.training.array;

/*WAP to find third maximum number from list of numbers*/

public class Array_Assign1 {
	
	public static void main(String args[])
	{
		int [] arr= {10,100,40,30,60};
		
		int first=0,second=0,third=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				third=second;
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second)
			{
				third=second;
				second=arr[i];
			}
			else 
			{
				third=arr[i];
			}
		}
		
		System.out.println(third);
	}
	

}
