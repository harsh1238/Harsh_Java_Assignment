package com.collection.assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class RemoveDup {

	public static void main(String[] args)
	{
		
		ArrayList<Integer> arr1=new ArrayList<>();
		arr1.add(30);
		arr1.add(90);
		arr1.add(30);
		arr1.add(20);
		arr1.add(50);
		arr1.add(100);
		
		int value=0;
		
		TreeSet<Integer> t1=new TreeSet<>(arr1);
		
		Iterator<Integer> ascSorting = t1.iterator();
        while(ascSorting.hasNext()) {
            System.out.println(ascSorting.next());
        }
		
//		ArrayList<Integer> arr2=new ArrayList<>();
//		
//		Iterator i = arr1.iterator();
//		
//		while(i.hasNext())
//		{
//			 int x = (Integer)i.next();
//			 
//			 if(x==value)
//			 {
//				 value=x;
//				 continue;
//			 }
//			 else
//			 {
//				 arr2.add(x);
//				 value=x;
//			 }
//		}
//		
//		System.out.println(arr2);
//		
//		
	}
}
