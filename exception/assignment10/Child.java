package com.exception.assignment10;


import java.text.ParseException;
import java.util.Scanner;

import com.exception.assignment10.Exe.exceptionHandling;

public class Child extends Parent
{
	public Child(String str) throws Exception
	{
		super(str);
	}
	
	
	public Child() {
		// TODO Auto-generated constructor stub
	}


	public void calcMax(int n) throws Exception
	{
		
		Scanner sc=new Scanner(System.in);
		
		if(n<=0)
		{
			throw new NullPointerException("user shouldnot enter 0 or negative number");
		}
		else 
		{
		
			int[] arr=new int[n];
			
			for(int i=0;i<arr.length;i++)
			{
				
				arr[i]=sc.nextInt();
				
			}
			
			
				int max=arr[0];
		
				for(int j=1;j<arr.length;j++)
				{
					
					
					if(arr[j]>max)
					{
						max=arr[j];
					}
					
				}
				
	
		
		int avg=0;
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			avg=sum/arr.length;
		}
		System.out.println(avg);
		System.out.println(max);
		
		}
	}
}
