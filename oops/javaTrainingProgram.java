package com.training.oops;

import java.util.LinkedList;
import java.util.List;

public class javaTrainingProgram {
	
	 String traineeName;
	 String position;
	 String requirment;
	 String programname;
	 String penName;
	 String BookName;
	 String noOfGirls;
	 String noOfBoys;
	static int count;
	
	public javaTrainingProgram(String traineeName,String position,String requirment,String programname)
	{
		this.traineeName=traineeName;
		this.position=position;
		this.programname=programname;
		this.requirment=requirment;
		this.count++;
	}
	
	public javaTrainingProgram(String traineeName,String position,String requirment,String programname,String penName,String BookName)
	{
		this.traineeName=traineeName;
		this.position=position;
		this.programname=programname;
		this.requirment=requirment;
		this.BookName=BookName;
		this.penName=penName;
		this.count++;
	}
	
	public javaTrainingProgram(String traineeName,String position,String requirment,String programname,String penName,String BookName,String noOfGirls, String noOfBoys)
	{
		this.traineeName=traineeName;
		this.position=position;
		this.programname=programname;
		this.requirment=requirment;
		this.BookName=BookName;
		this.penName=penName;
		this.noOfBoys=noOfBoys;
		this.noOfGirls=noOfGirls;
		this.count++;
	}
	List<String> display()
	{
		List<String> l1=new LinkedList<String>();
		l1.add(programname);
		l1.add(requirment);
		l1.add(traineeName);
		l1.add(position);
		l1.add(BookName);
		l1.add(penName);
		l1.add(noOfBoys);
		l1.add(noOfBoys);
		
		return l1;
	}

	public static void main(String[] args) {
		
		javaTrainingProgram j1= new javaTrainingProgram("Harsh","trainee","Java","Systems");
		//System.out.println(j1.display());
		javaTrainingProgram j2= new javaTrainingProgram("Harsh","trainee","Java","Systems","book","pen");
		//System.out.println(j2.display());
		javaTrainingProgram j3= new javaTrainingProgram("Harsh","trainee","Java","Systems","book","pen","20","30");
		javaTrainingProgram j4= new javaTrainingProgram("Harsh","trainee","Java","Systems","book","pen","20","30");
		//System.out.println(j3.display());
		
		
		//created Array of objects
		Object[] obj1= new Object[count];
		obj1[0]=j1;
		obj1[1]=j2;
		obj1[2]=j3;
		obj1[3]=j4;
		
		for(Object test: obj1)
		{
			System.out.println(test);
		}
		
		
		//Using equals method
//		System.out.println(j1.equals(j3));
//		System.out.println(j1.equals(j2));
//		System.out.println(j3.equals(j4));
//		
//		//using hashcode method
//		System.out.println(j1.hashCode());
//		System.out.println(j2.hashCode());
//		System.out.println(j3.hashCode());
//		
//		//Tostring method usage
//		System.out.println(j2.toString());
//		System.out.println(j1.toString());
//		System.out.println(j3.toString());
//		System.out.println(j1.toString().equals(j4));
		
		
	}

	@Override
	public String toString() {
		return "javaTrainingProgram [traineeName=" + traineeName + ", position=" + position + ", requirment="
				+ requirment + ", programname=" + programname + ", penName=" + penName + ", BookName=" + BookName
				+ ", noOfGirls=" + noOfGirls + ", noOfBoys=" + noOfBoys + "]";
	}
}
