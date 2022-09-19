package com.exception.assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.exception.assignment4.exe.ItemPurchaseLimitExceed;


public class DriverClass {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub

		
		ItemBought item1= new ItemBought("_Apple_A1Code", 20);
		ItemBought item2= new ItemBought("_Refrigerator_B1Code", 30);
		ItemBought item3= new ItemBought("_Ninja_N1Code", 4);
		ItemBought item4= new ItemBought("_Brush_B1Code", 10);
		
		Category item1category=new Category(1, "Fruites",item1);
		Category item2category=new Category(2, "Electronincs",item2);
		Category item3category=new Category(3, "Vehicle_Bike",item3);
		Category item4category=new Category(4, "DailyUsage",item4);
		
		ArrayList<Category> arrayOfItemList=new ArrayList<>();
		arrayOfItemList.add(item1category);
		arrayOfItemList.add(item2category);
		arrayOfItemList.add(item3category);
		arrayOfItemList.add(item4category);
		
//	int item101=item1.getItemqty();
//	int item102=item2.getItemqty();
//	int item103=item3.getItemqty();
//	int item104=item4.getItemqty();
		
		
		Item itemArra1=new Item("Apple", 2000, 20, arrayOfItemList);
		Item itemArra2=new Item("_Refrigerator", 2000, 20, arrayOfItemList);
		Item itemArra3=new Item("Ninja", 2000, 20, arrayOfItemList);
		Item itemArra4=new Item("Brush", 2000, 20, arrayOfItemList);
		
		ArrayList<Item> arr1=new ArrayList<>();
		arr1.add(itemArra4);
		arr1.add(itemArra3);
		arr1.add(itemArra2);
		arr1.add(itemArra1);
		
		try {
			userQuantity(arr1);
		} catch (ItemPurchaseLimitExceed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void userQuantity(ArrayList<Item> arr1) throws Throwable {
		// TODO Auto-generated method stub
		for(Item p:arr1)
		{
			int n=p.getMaxitembought();
			double price=p.getPrice();
			
			HashMap<String, Integer> maxLimit=new HashMap<>();
			maxLimit.put("FruitsMaxQty", 30);
			maxLimit.put("ElectronincMaxQty", 30);
			maxLimit.put("VehicleMaxQty", 0);
			maxLimit.put("DailyUsageMaxQty", 30);
			
			for (Map.Entry<String, Integer> set :
				maxLimit.entrySet())
			{
				if(n>set.getValue())
				{
					throw new ItemPurchaseLimitExceed(p.getName()+" -> "+"ItemPurchaseLimit has been exceeded, so please purchage item within the limit ");
				}
				if(set.getValue()==0)
				{
					throw new Exception(set.getKey()+ " ->"+"maximum item limit is set to 0");
				}
			}
			
			 if(price==0)
				 {
					 throw new Exception(p.getName()+"->"+"The item amount is set to 0");
				 }
			 if(true)
			 {
				 System.out.println(p);
			 }
	}

	}
}
