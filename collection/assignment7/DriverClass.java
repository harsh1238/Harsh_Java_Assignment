package com.collection.assignment7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DriverClass {

	public static void main(String[] args) {
		

		Student student1=new Student(1, "harsh", "fifth", 300);
		Student student2=new Student(2, "aa", "fifth", 400);
		Student student3=new Student(3, "rr", "fifth", 200);
		Student student4=new Student(4, "ww", "fifth", 350);
		Student student5=new Student(5, "zz", "fifth", 500);
		Student student6=new Student(6, "zz", "fifth", 100);
	
		
		ArrayList<Student> student=new ArrayList<>();
		student.add(student5);
		student.add(student4);
		student.add(student3);
		student.add(student2);
		student.add(student1);
		student.add(student6);
		
		//A.top 3 student list
		topthreestudent(student);
		
		//E.sort student list in ascending order using names
		sortStudent(student);
		
		//D.Average marks number of students
		avgNumberOfMarks(student);
		
		//B.Number of students below 50%
		belowFiftyPercentage(student);
		
		//C.below 35% marks student details
		failedStudentsDetails(student);
		 
	}

	private static void failedStudentsDetails(ArrayList<Student> student) {
		// TODO Auto-generated method stub
		System.out.println("Printing student details with less than 35%");
		System.out.println();
		for(Student p:student)
		{
			double x=p.getTotalmarks();
			double avg=(x/500)*100;
			
			if(avg<35)
			{
				System.out.println(p);
			}
		}
		System.out.println();
	}

	
	
	private static void belowFiftyPercentage(ArrayList<Student> student) {
		// TODO Auto-generated method stub
		System.out.println("Printing less than 50% student detail");
		System.out.println();
		for(Student p:student)
		{
			double x=p.getTotalmarks();
			double avg=(x/500)*100;
			
			if(avg<50)
			{
				System.out.println(p);
			}
		}
		System.out.println();
	}

	private static void avgNumberOfMarks(ArrayList<Student> student) {
		// TODO Auto-generated method stub
		System.out.println("Printing average marks student detais");
		System.out.println();
		for(Student p:student)
		{
			if(p.getTotalmarks()>300)
			{
				System.out.println(p);
			}
		}
		System.out.println();
	}

	private static void sortStudent(ArrayList<Student> student) {
		// TODO Auto-generated method stub
		Collections.sort(student,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) 
			{
				// TODO Auto-generated method stub
			String s1	= o1.getSname() ;
			String s2	= o2.getSname() ;
			return s2.compareTo(s1);
			}
		});
			
		System.out.println("-------------sorted student list in ascending order using names------------");
		for(int i=student.size()-1;i>=0;i--)
		{
			
			System.out.println(student.get(i));
		}
		System.out.println();
}

	private static void topthreestudent(ArrayList<Student> student) {
		// TODO Auto-generated method stub
		
		Collections.sort(student,new Comparator<Student>() 
		{

			@Override
			public int compare(Student o1, Student o2)
			{
				// TODO Auto-generated method stub
			Integer s1	= o1.getTotalmarks() ;
			Integer s2	= o2.getTotalmarks() ;
			return s2.compareTo(s1);
			}
		});
		
		System.out.println("-----------------------Top 3 student list------------------");
		for(int i=0;i<3;i++)
		{
			
			System.out.println(student.get(i));
		}
		System.out.println();
		
	}


}
