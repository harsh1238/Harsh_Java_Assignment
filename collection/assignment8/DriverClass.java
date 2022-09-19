package com.collection.assignment8;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.collection.assignment7.Student;

public class DriverClass 
{

	public static void main(String[] args) {
		
//		itemnames item1=new itemnames("Pen");
//		itemnames item2=new itemnames("Pen");
//		itemnames item3=new itemnames("Pen");
//		itemnames item4=new itemnames("Pen");
//		itemnames item5=new itemnames("Pen");
//		
//		ArrayList<itemnames> item=new ArrayList<itemnames>();
//		item.add(item1);
//		item.add(item2);
//		item.add(item3);
//		item.add(item4);
//		item.add(item5);
		
		//LocalDate date=LocalDate.of(03, Month.SEPTEMBER, 2022);
		LocalDate localDate1 = LocalDate.parse("2022-08-06");
		LocalDate localDate2 = LocalDate.parse("2022-03-05");
		LocalDate localDate3= LocalDate.parse("2022-02-09");
		LocalDate localDate4 = LocalDate.parse("2022-01-01");
		LocalDate localDate5 = LocalDate.parse("2022-05-01");
		
		//LocalDateTime now = LocalDateTime.now();
		
		ProductionFacility prod1 =new ProductionFacility(1, "harsh", "Bangalore", 300, "pen", localDate1);
		ProductionFacility prod2 =new ProductionFacility(2, "zZ", "Bangalore", 400, "book", localDate2);
		ProductionFacility prod3 =new ProductionFacility(3, "aa", "Bangalore", 800, "Pencil", localDate3);
		ProductionFacility prod4 =new ProductionFacility(4, "viki", "Bangalore", 100, "Bags", localDate4);
		ProductionFacility prod5 =new ProductionFacility(5, "shet", "Bangalore", 600, "Sheos", localDate5);
		
		ArrayList<ProductionFacility> list1 = new ArrayList<>();
		list1.add(prod5);
		list1.add(prod4);
		list1.add(prod3);
		list1.add(prod2);
		list1.add(prod1);
		
		//B.Print details based on the names in ascending order
		printNamesinAscendingOrder(list1);
		
		//C.Print which facility is producing highest item.
		highestProductProducing(list1);
		
		//D.Print production detail of each facility on the basis of production date.
		printBasesOfProductionDate(list1);
		
		//.Print the details of facility with highest production per day. (you have to
		//add at least 3 days details of each facility after that you have to calculate
		//average of 3 days on the basis of average you have to print the facility with
		//highest production
	highestProduction(list1);
	}

	

	private static void highestProduction(ArrayList<ProductionFacility> list1) {
		// TODO Auto-generated method stub
		Collections.sort(list1,new Comparator<ProductionFacility>() 
		{

			@Override
			public int compare(ProductionFacility o1, ProductionFacility o2)
			{
				// TODO Auto-generated method stub
			Integer s1	= o1.getTotalproduction_perday() ;
			Integer s2	= o2.getTotalproduction_perday() ;
			return s2.compareTo(s1);
			}
		});
		System.out.println(list1.get(0));
	}



	private static void printBasesOfProductionDate(ArrayList<ProductionFacility> list1) {
		// TODO Auto-generated method stub
		System.out.println("Printing on the bases of productio  date");
		Collections.sort(list1, new Comparator<ProductionFacility>() {

			@Override
			public int compare(ProductionFacility o1, ProductionFacility o2) {
				// TODO Auto-generated method stub
				LocalDate s1=o1.getProd_date();
				LocalDate s2=o2.getProd_date();
				return s2.compareTo(s1);
			}
		});
		
		for(ProductionFacility p:list1)
		{
			System.out.println(p);
		}
	}



	private static void highestProductProducing(ArrayList<ProductionFacility> list1) {
		// TODO Auto-generated method stub
		System.out.println("Printing highest number of facilities producing ");
		Collections.sort(list1,new Comparator<ProductionFacility>() 
		{

			@Override
			public int compare(ProductionFacility o1, ProductionFacility o2)
			{
				// TODO Auto-generated method stub
			Integer s1	= o1.getTotalproduction_perday() ;
			Integer s2	= o2.getTotalproduction_perday() ;
			return s2.compareTo(s1);
			}
		});
		System.out.println(list1.get(0));
		
	}



	private static void printNamesinAscendingOrder(ArrayList<ProductionFacility> list1) {
		// TODO Auto-generated method stub
		
		Collections.sort(list1, new Comparator<ProductionFacility>() {

			@Override
			public int compare(ProductionFacility o1, ProductionFacility o2) {
				// TODO Auto-generated method stub
				String s1=o1.getPro_facility_name();
				String s2=o2.getPro_facility_name();
				
				return s1.compareTo(s2);
			}
		});
		
		System.out.println("-------------sorted student list in ascending order using names------------");
		for(int i=list1.size()-1;i>=0;i--)
		{
			
			System.out.println(list1.get(i));
		}
		
	}
}
