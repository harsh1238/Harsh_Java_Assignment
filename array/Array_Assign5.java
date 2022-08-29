package com.training.array;

import java.util.Scanner;

public class Array_Assign5 {
	
	public static void main(String[] args)
	{
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		int[] arr=new int[n];
//		
//		for(int i=0;i<n;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
		
		int[] arr= {1,2,3,28,496,5};
		
		int even = 0,odd=0,perfect=0,prime=0;

		
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i]%2!=0)
				{
					odd++;
				}
				else 
				{
					even++;
				}
				
				
				if(arr[i]==0||arr[i]==1)
				{
					continue;
				}
				
				int sum=0,count=0;
			for(int j=1;j<=arr[i];j++)
			{
				
				if(arr[i]%j==0)
				{
					
					count++;
					sum+=j;
				}
				
			}
			if(count==2)
			{
				prime++;
			}
			if(sum-arr[i]==arr[i])
			{
				perfect++;
			}
				
		}
		
		System.out.println("Odd number count "+odd+"Even number count "+even+"Prime number count"+prime+"Perfect numbers"+ perfect);
		
	}

}
