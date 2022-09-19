package com.exception.assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.exception.assignment4.exe.ItemPurchaseLimitExceed;

public class Item 
{
	String name;
	double price;
	int maxitembought;
	ArrayList<Category> category;
	
	public Item()
	{
		
	}
	
	public Item(String str) throws Exception
	{
		
	}

	public Item(String name, double price, int maxitembought, ArrayList<Category> category) {
		super();
		this.name = name;
		this.price = price;
		this.maxitembought = maxitembought;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMaxitembought() {
		return maxitembought;
	}

	public void setMaxitembought(int maxitembought) {
		this.maxitembought = maxitembought;
	}

	public ArrayList<Category> getCategory() {
		return category;
	}

	public void setCategory(ArrayList<Category> category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", maxitembought=" + maxitembought + ", category=" + category
				+ "]";
	}
	
	
}
