package com.exception.assignment4;

public class ItemBought 
{
	String  itemid;
	int itemqty;
	public ItemBought(String itemid, int itemqty) {
		super();
		this.itemid = itemid;
		this.itemqty = itemqty;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public int getItemqty() {
		return itemqty;
	}
	public void setItemqty(int itemqty) {
		this.itemqty = itemqty;
	}
	@Override
	public String toString() {
		return "ItemBought [itemid=" + itemid + ", itemqty=" + itemqty + "]";
	}
}
