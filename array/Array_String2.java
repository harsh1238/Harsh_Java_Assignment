package com.training.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*WAP to find duplicate numbers and there counting from list of numbers.
*/
public class Array_String2 {
	
	public static void main(String[] args) {
		
		
		int[] arr= {1,4,3,2,6,8,8};
		
Map<Integer,Integer> m1 = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(m1.containsKey(arr[i]))
			{
				m1.put(arr[i], m1.get(arr[i])+1);
			}
			else
			{
				m1.put(arr[i], 1);
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
