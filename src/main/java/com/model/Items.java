package com.model;

public class Items {
	private int id;
	private String category;
	private String itemNames;
	private static String brandName;
	private int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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
		return "Items [id=" + id + ", category=" + category + ", itemNames=" + itemNames + ", price=" + price + "]";
	}

	

}
