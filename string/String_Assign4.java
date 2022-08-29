package com.training.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class String_Assign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Entering input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String str1=sc.nextLine();
		
	
		
		char char1[]= str1.toCharArray();
		
		Map<Character,Integer> m1 = new HashMap<Character,Integer>();
		
		for(Character ch: char1 )
		{
			if(m1.containsKey(ch))
			{
				m1.put(ch, m1.get(ch)+1);
			}
			else
			{
				m1.put(ch, 1);
			}
		}
		
		Set s1=m1.entrySet();
		Iterator itr= s1.iterator();
        System.out.println("Characters in the string and its count:");
        while(itr.hasNext())
        {
            Map.Entry m= (Map.Entry) itr.next();
            System.out.println(m.getKey()+"->"+m.getValue());
        }
	}	
	}


