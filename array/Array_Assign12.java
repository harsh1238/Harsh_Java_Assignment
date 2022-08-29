package com.training.array;

public class Array_Assign12
{
	
	public static void main(String[] args)
	{
		int[] str1= {10,2,3,41,9,81};
//		
//		String[] str1=array_String.split("\\s"); 
		
	        for(int i=0;i<str1.length;i++)
	        {
	        	
	        	{
		        	for(int j=i;j<str1.length;j++)
		        	{
		        		if(str1[i]%10>str1[j]%10)
		        		{
		        			int temp=str1[i];
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
