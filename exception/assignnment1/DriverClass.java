package com.exception.assignnment1;

import java.util.Scanner;

public class DriverClass
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter number of subject markes");
		 int n=sc.nextInt();
		 
		 try {
			StudentResult result=new StudentResult(n);
			Student s=new Student(1, "Harsh", "yash Magarpatta", result);
		} catch (ResultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
