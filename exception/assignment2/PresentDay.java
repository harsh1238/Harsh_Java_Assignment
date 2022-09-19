package com.exception.assignment2;

import java.util.ArrayList;

import com.exception.assignment2.exe.LeaveExceedLimitException;
public class PresentDay 
{

	 int l;
	int p;
	int n;
	int a;
	int salary;
	int id;
	String name;
	
	
	
	public PresentDay(int l, int p, int n, int a, int salary, int id, String name) throws Exception {
		super();
		this.l = l;
		this.p = p;
		this.n = n;
		this.a = a;
		this.salary = salary;
		this.id = id;
		this.name = name;
	}

	public PresentDay(String str) throws Exception
	{

	}
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "PresentDay [l=" + l + ", p=" + p + ", n=" + n + ", a=" + a + ", salary=" + salary + ", id=" + id
				+ ", name=" + name + "]";
	}
	
	
	
	
}
