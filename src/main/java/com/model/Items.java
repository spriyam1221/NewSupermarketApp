package com.model;

import java.sql.Date;

public class Items {
	private int id;
	private String section;
	private String itemNames;
	private static String brandName;
	private int price;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getitemsName() {
		return itemNames;
	}

	public void setitemsName(String itemsName) {
		this.itemNames = itemsName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ",section=" + section + ", itemNames=" + itemNames + ", price=" + price + "]";
	}

	public String getDate() {
		
		return null;
	}

	public void setDate(Date date) {
		// TODO Auto-generated method stub
		
	}

	

}
