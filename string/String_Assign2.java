package com.training.string;

import java.util.Arrays;
import java.util.Scanner;

/* WAP to print the all alphabets of string in ascending and descending order*/

public class String_Assign2 {

	public static void main(String[] args)
	{
		
		//Entering input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String str1=sc.nextLine();
		
		
		char char1[]=str1.toCharArray();
		
		char temp;
		
		//Ascending order sorting logic
		System.out.println("//Ascending order sorting//");
		for(int i=0;i<str1.length();i++)
		{
			for(int j=i+1;j<str1.length();j++)
			{
			
			if(char1[i]>char1[j]) {
				temp=char1[i];
				char1[i]=char1[j];
				char1[j]=temp;
			}
			}			
		}
		
		System.out.println(Arrays.toString(char1));

		//Ascending by default method
		Arrays.sort(char1);
		
		System.out.println(new String(char1));
		
		//Descending order sorting logic
				System.out.println("//Descending  order sorting//");
				for(int i=0;i<str1.length();i++)
				{
					for(int j=i+1;j<str1.length();j++)
					{
					
					if(char1[i]<char1[j]) {
						temp=char1[i];
						char1[i]=char1[j];
						char1[j]=temp;
					}
					}			
				}
				
				System.out.println(Arrays.toString(char1));			
	}

}
