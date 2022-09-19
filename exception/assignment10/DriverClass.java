package com.exception.assignment10;

import java.util.Scanner;

public class DriverClass
{
	
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		try {
			Parent p=new Child();
			try {
				p.calcMax(n);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
