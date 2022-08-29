package com.training.string;

/*WAP to demonstrate which is fast in processing StringBuilder or StringBuffer*/

public class String_Assign5
{
	
	public static void main(String[] args) {
		
	long StartTiming = System.currentTimeMillis();
	
	StringBuffer sb1 = new StringBuffer("Yash");
	for(int i=0;i<1000000;i++)
	{
		sb1.append("Magarpatta");
	}
	
	System.out.println("String buffer timing:"+ (System.currentTimeMillis()-StartTiming)+"MS");
	
	StartTiming = System.currentTimeMillis();
	StringBuilder sb2 = new StringBuilder("Yash");
	for(int i=0;i<1000000;i++)
	{
		sb2.append("Magarpatta");
	}
	
	System.out.println("String Builder timing:"+ (System.currentTimeMillis()-StartTiming)+"MS");
	}

}
