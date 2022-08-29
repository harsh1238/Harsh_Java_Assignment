package com.training.string;


/*WAP to demonstrate how memory is allocated to string objects in memory heap and string
constant pool.
*/
public class String_Assign6 {
public static void main(String[] args) {
		
		String s1="Yash";
		String s2="Yash";
		
		String s3=new String("Yash");
		String s4=new String("Yash");
		
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		System.out.println(s1==s4);//false
		
		System.out.println(s1.equals(s4));//true
		System.out.println(s1.equals(s3));//true
		
		System.out.println(s3.compareTo(s4));//0
		System.out.println(s3.compareTo(s1));//0
	}

}
