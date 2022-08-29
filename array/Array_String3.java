package com.training.array;

import java.util.Scanner;

/*WAP to create a dynamic array. Dynamic Array means when user want to input the number
more than size of array it will increase the size of array without throwing exception.
*/

public class Array_String3 {

public static void main(String[] args) {
		
		/* Dynamic array allocation program*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n=sc.nextInt();
		
		
		int arr[]=new int[n];
		
		System.out.println("Enter initial series of number");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int new_size=sc.nextInt();
		
		int Total_size=n+new_size;
		int[] newArray=new int[Total_size];
		
		for(int i=0;i<n;i++)
		{
			newArray[i]=arr[i];
		}
		
		for(int j=n;j<(n+new_size);j++)
		{
			newArray[j]=sc.nextInt();
		}
		
		for(int i=0;i<Total_size;i++)
		{
			System.out.println(newArray[i]);
		}
	}
}
