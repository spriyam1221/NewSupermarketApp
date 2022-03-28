package com.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.ItemsInsertion;
import com.model.Items;

public class ItemsInsertionTest {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter items section");
		String section=sc.next();
		System.out.println("Enter items name");
		String itemsName=sc.next();
		System.out.println("Enter items brand");
		String brandName=sc.next();
		System.out.println("Enter items price");
		int price=sc.nextInt();
		Items item=new Items();
		
		item.setSection(section);
		item.setitemsName(itemsName);
		item.setBrandName(brandName);
		item.setPrice(price);
		ItemsInsertion.itemsinsertion(item);

	}

}

