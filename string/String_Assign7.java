package com.training.string;


/*WAP to demonstrate how garbage collector work when any memory is not referenced by string
object.*/

public class String_Assign7 {
	
public static void main(String[] args) {
		
	String_Assign7 g1 = new String_Assign7();
	String_Assign7 g2 = new String_Assign7();
	String_Assign7 g3 = new String_Assign7();
		
		g2=g3;
		System.out.println(g1.hashCode());
		
		g1=null;
		
		System.gc();
	}
	
	public void finalize()
	{
		System.out.println("Object is garbage colected");
	}

}
