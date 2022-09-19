package com.exception.assignnment1;

import java.util.Scanner;

public class StudentResult 
{

	public static void studentResult(String string) throws ResultException
	{
		// TODO Auto-generated constructor stub
	}
	
	public StudentResult(int n) throws ResultException
		{
			
				Scanner sc=new Scanner(System.in);
				 
				 int[] resultarray=new int[n];
		 
		 for(int i=0;i<resultarray.length;i++)
			 {
				 System.out.println("enter number of marks");
				 resultarray[i]=sc.nextInt();
			 }
		 
			 for(int i=0;i<resultarray.length;i++)
			 {
				 if(resultarray[i]<40||resultarray[i]<0)
				 {
					 throw new ResultException("Student failed in subject");
				 }
				 else
				 {
					 System.out.println("Student passed in exam");
				 }
			 }
		}
	
}
