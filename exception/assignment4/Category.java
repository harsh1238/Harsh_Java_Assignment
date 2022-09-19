package com.exception.assignment4;

public class Category
{
	int  catid;
	String categoryname;
	ItemBought itemBought;
	public Category(int catid, String categoryname,ItemBought itemBought) {
		super();
		this.catid = catid;
		this.categoryname = categoryname;
		this.itemBought=itemBought;
	}
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	
	
	public ItemBought getItemBought() {
		return itemBought;
	}
	public void setItemBought(ItemBought itemBought) {
		this.itemBought = itemBought;
	}
	@Override
	public String toString() {
		return "Category [catid=" + catid + ", categoryname=" + categoryname + ", itemBought=" + itemBought + "]";
	}

	
}
