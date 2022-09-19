package com.exception.assignment2;

import com.exception.assignment2.exe.LeaveExceedLimitException;

import java.util.ArrayList;

//WAP to take Employee daily attendance in an array of int with name presentdays. You also take
//salary per month of the Employee. You need to calculate the total day an employee is present.
//Employee will input in following format P for present, L for leave it will be paid leave, A for absent,
//N for no information about this day.
//An employee can not take more than 2 leaves in a month if he takes more than two leave you need
//to throw the exception. LeaveExceedLimitException.
//If for any employee N is continuously for four days you need to throw exception
//EmployeeAbscondingException. In this case salary will not be calculated.
//If all goes good you need to print the total salary of employee for that particular month.

public class Employee 
{
	 ArrayList<PresentDay> presentDay;
	 PresentDay present;
	 double eSalary;
	 int eid;
	 String eName;
	 
	 public Employee(String str) throws Exception
		{
		 
		}
	 
	 public Employee()
	 {
		 
	 }
	 
	 
	
	public Employee(ArrayList<PresentDay> presentDay) throws Exception {
		super();
		this.presentDay = presentDay;
	}

	public ArrayList<PresentDay> getPresentDay() {
		return presentDay;
	}

	public void setPresentDay(ArrayList<PresentDay> presentDay) {
		this.presentDay = presentDay;
	}

	@Override
	public String toString() {
		return "Employee [presentDay=" + presentDay + ", present=" + present + ", eSalary=" + eSalary + ", eid=" + eid
				+ ", eName=" + eName + "]";
	}

	
}
