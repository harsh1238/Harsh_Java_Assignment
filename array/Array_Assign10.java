package com.training.array;

import java.util.Scanner;

public class Array_Assign10 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
//		Scanner sc=new Scanner(System.in); 
//				  System.out.println("Enter String:"); 
//				  String array_String=sc.nextLine(); 
//				  String[] str1=array_String.split("\\s");
		
	String[] str1= {"Harsh","a","aba","abba","bb"};
//		
//		String[] str1=array_String.split("\\s"); 
		
	        for(int i=0;i<str1.length;i++)
	        {
	        	
	        	{
		        	for(int j=i;j<str1.length;j++)
		        	{
		        		if(str1[i].length()>str1[j].length())
		        		{
		        			String temp=str1[i];
		        			str1[i]=str1[j];
		        			str1[j]=temp;
		        		}
		        	}
	        	}
	        }
	        
	        for(int i=0;i<str1.length;i++) 
      	  { 
      	  System.out.print(str1[i]+" ");  
      	  } 
	}

}
