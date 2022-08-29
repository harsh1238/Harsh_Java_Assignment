package com.training.array;

import java.util.Scanner;

public class Array_assign4
{
	public static void main(String[] args) {
		
		int[] ar= {10,4,2,3,5};
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				for(int k=0;k<ar.length;k++)
				{
				int x = ar[i] * ar[i], y = ar[j] * ar[j], z = ar[k] * ar[k];
				 
                if (x == y + z || y == x + z || z == x + y)
                {
                	System.out.println("pythagorus satisfied"+"x-value:"+ar[i]+"y-value: "+ar[j]+"z-value: "+ar[k]);
                }
  
			}
			}
		}
		
		
	}
}
