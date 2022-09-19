package com.collection.assignment6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.logging.Logger;

public class Hashmap1 {
	
	public static void main(String[] args) {
		
		Logger log=Logger.getLogger(Hashmap1.class.getName());
		
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		hashmap.put("Pune", 20000);
		hashmap.put("Bangalore", 30000);
		hashmap.put("Kolkata", 10000);
		hashmap.put("Chennai", 10000);
		hashmap.put("Chandighar", 90000);
		
		
		Iterator<String> iter1=hashmap.keySet().iterator();
		log.info("Printing hashmap details");
		while(iter1.hasNext())
		{
			String key=(String)iter1.next();  
			System.out.println("city:  "+key+"     Population:   "+hashmap.get(key));  
		}
		
		log.info("Performing sorting operation");
		
		TreeMap<String, Integer> treemap=new TreeMap<String, Integer>(hashmap);
		
		Iterator<String> iter2=treemap.keySet().iterator();
		log.info("Printing treemap details");
		while(iter2.hasNext())
		{
			String key=(String)iter2.next();  
			System.out.println("city:  "+key+"     Population:   "+treemap.get(key));  
		}
	}

}
