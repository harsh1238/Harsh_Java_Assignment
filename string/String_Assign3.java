package com.training.string;

import java.util.Scanner;

public class String_Assign3 {
	
	public static void main(String args[])
	{
		
		//Entering input from user
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter First String");
				String str1=sc.nextLine();
				
				String Result= " ";
				
				char char1[]= str1.toCharArray();
				
				for(int i=0;i<str1.length();i++)
				{
					if(char1[i]=='A' || char1[i]=='a'|| char1[i]=='E'|| char1[i]=='e' || char1[i]=='I' || char1[i]=='i'||char1[i]=='o'||char1[i]=='O'||char1[i]=='U'||char1[i]=='u')
					{
						continue;
					}
					else
					{
						Result+=char1[i];
					}
				}
				
				System.out.println(Result);
	}

}
