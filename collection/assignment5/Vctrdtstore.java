package com.collection.assignment5;

import java.util.Collections;
import java.util.Vector;
import java.util.logging.Logger;

public class Vctrdtstore {
	public static void main(String[] args) {
		
		Logger log=Logger.getLogger(Vctrdtstore.class.getName());
		
		Vector<Integer> vector=new Vector<>();
		vector.add(30);
		vector.add(20);
		vector.add(50);
		vector.add(20);
		vector.add(80);
		vector.add(90);
		vector.add(10);
		vector.add(00);
		
		log.info("printing vector data in sorted format");
		
		Collections.sort(vector);
		
		System.out.println(vector);
		
		
		
	}

}
