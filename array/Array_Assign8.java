package com.training.array;

import java.util.Scanner;

/*You are given a sequence of Character in the form of Array. Now you have to put all vowels and
consonants together in the array.
*/
public class Array_Assign8 {
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String str1=sc.nextLine();
		
		
		
		char[] result=new char[10];
		int start=0;
		int last=str1.length()-1;
		
		char char1[]=str1.toCharArray();
		
		for(int i=0;i<str1.length();i++)
		{
			
			
			if(char1[i]=='A' || char1[i]=='a'|| char1[i]=='E'|| char1[i]=='e' || char1[i]=='I' || char1[i]=='i'||char1[i]=='o'||char1[i]=='O'||char1[i]=='U'||char1[i]=='u')
			{
				result[start]+=char1[i];
				start++;
			}
			else
			{
				result[last]+=char1[i];
				last--;
			}
			
	
		}
		
		System.out.println(result);	
	}

}
