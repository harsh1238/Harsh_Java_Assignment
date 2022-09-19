package com.exception.assignment2;

import java.util.ArrayList;

import com.exception.assignment2.exe.EmployeeAbscondingException;
import com.exception.assignment2.exe.LeaveExceedLimitException;

public class ExecutionClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		PresentDay emp1 = new PresentDay(2,28,0,0,1,20000,"Harsh");
		 PresentDay emp2 = new PresentDay(0,24,4,1,1,80000,"Piyush");
		 PresentDay emp3 = new PresentDay(4,20,5,1,1,10000,"Sid");
		 PresentDay emp4 = new PresentDay(0,20,2,6,1,30000,"Zayn");
		 
		 ArrayList<PresentDay> attendanceDataArray1 = new ArrayList<>();
		 attendanceDataArray1.add(emp1);
		 attendanceDataArray1.add(emp2);
		 attendanceDataArray1.add(emp3);
		 attendanceDataArray1.add(emp4);
		 
		 //Throwing exception for Employee who has more than 2 absents 
		 absentdetails(attendanceDataArray1);
		 
		 //Throwing exception for Employee who has no information for more than 4 days
		 EmployeeAbsconding(attendanceDataArray1);
	}
	
	private static void EmployeeAbsconding(ArrayList<PresentDay> attendanceDataArray1)throws Exception {
		// TODO Auto-generated method stub
		for(PresentDay p:attendanceDataArray1)
		{
			if(p.getN()>4)
			{
			int salary	=p.getSalary();
			salary=0;
			throw new EmployeeAbscondingException("Absconding Employee from the organisation as he is not shown to office more than 4 days and don't have any information"+""+p);
			}
		}
	}

	private static void absentdetails(ArrayList<PresentDay> attendanceDataArray1) throws Exception {
		// TODO Auto-generated method stub
		
		for(PresentDay p:attendanceDataArray1) {
			if(p.getA()>2)
			{
				throw new LeaveExceedLimitException("Absent for more than 2 days "+""+p );
			}
			
		}
	}

}
 