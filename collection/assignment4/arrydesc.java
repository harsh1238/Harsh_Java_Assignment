package com.collection.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.logging.Logger;

public class arrydesc {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger log=Logger.getLogger(arrydesc.class.getName());
		
		ArrayList<Integer> arrdesc = new ArrayList<>();
		
		arrdesc.add(20);
		arrdesc.add(10);
		arrdesc.add(90);
		arrdesc.add(40);
		arrdesc.add(10);
		
		 Collections.sort(arrdesc, Collections.reverseOrder());
		
		 log.info("Printign list in ascending order with duplicate values: ");
		System.out.println(arrdesc);
		
		System.out.println();
		
		Set<Integer> set1=new LinkedHashSet<Integer>(arrdesc);
		
		 log.info("\"Converted list into set and remved duplicates : \"");
		
		for(Integer x:set1)
		{
			System.out.println(x);
		}
	}

}
