package com.collections.assignment1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr1=new ArrayList<>();
		arr1.add(8);
		arr1.add(6);
		arr1.add(2);
		arr1.add(9);
		arr1.add(6);
		arr1.add(0);
		arr1.add(2);
		arr1.add(34);
		arr1.add(3);
		
		Collections.sort(arr1);
		
		System.out.println(arr1);
	}

}
