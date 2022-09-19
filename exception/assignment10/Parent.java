package com.exception.assignment10;

import java.util.Scanner;

import com.exception.assignment10.Exe.exceptionHandling;

public class Parent {

	public Parent(String str) throws Exception
	{

	}

	public Parent()
	{

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

			for(int i=0;i<=arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}

			if(arr.length>n)
			{
				throw new ArrayIndexOutOfBoundsException("check array size, its exceding the size");
			}
			else
			{
				int max=arr[0];

				for(int j=1;j<arr.length;j++)
				{


					if(arr[j]>max)
					{
						max=arr[j];
					}

				}

				System.out.println(max);
			}
		}
	}
}
