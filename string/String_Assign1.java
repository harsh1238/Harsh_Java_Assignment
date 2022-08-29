package com.training.string;

import java.util.Scanner;

/*  Create a program in which two string is input by the user and after that user will enter index in
first string where we want to insert the second string and insert the second string at that index
and create a new string */

public class String_Assign1 {
	
	public static void main(String args[])
	{
		
		//Taking inputs from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String str1=sc.nextLine();
		
		System.out.println("Enter Second String");
		String str2=sc.nextLine();
		
		System.out.println("Enter index for first string");
		int index=sc.nextInt();
		
		//String str3 = str1.substring(0, index)+str2+str1.substring(index);
		
		String Result= " "; 
		
		//Converting string to charecter 
		char char1[]=str1.toCharArray();
		char char2[]=str2.toCharArray();
		
		for(int i=0;i<index;i++)
		{
			Result+=char1[i];
		}
		
		for(int i=0;i<str2.length();i++)
		{
			Result+=char2[i];
		}
		
		for(int i=index;i<str1.length();i++)
		{
			Result+=char1[i];
		}
		
		System.out.println("//new string output//");
		System.out.println(Result);
		
	}

}
