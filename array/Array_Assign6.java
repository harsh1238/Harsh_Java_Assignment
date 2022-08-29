package com.training.array;


/*Suppose that you are having an array of size N. now your task is to sort the half array that is
from 0 to N/2 in ascending order and N/2+1 to N in descending order. */

public class Array_Assign6 {

public static void main(String[] args) {
		
		
		int[] a= {1,4,2,7,4,9};
		
		int n=a.length;
		
		for(int i=0;i<n-1;i++)
		{
			int temp;
			for(int j=0;j<n/2;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
			for(int j=n/2;j<n-1;j++)
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		
	} 
}
