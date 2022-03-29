package com.supermarketTest.daoTest;

import java.sql.SQLException;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.supermarketTest.modelTest.UserTest;
import com.supermarketapp.dao.ItemDAO;
import com.supermarketapp.model.Item;

public class InsertionTest {
	
	private static Logger log = LogManager.getLogger(UserTest.class);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter items section");
		log.info("Enter items section  ");
		String section=sc.next();
		
		System.out.println("Enter items name");
		log.info("Enter items name  ");
		String itemsName=sc.next();
		
		System.out.println("Enter items brand");
		log.info("Enter items brand ");
		String brandName=sc.next();
		
		System.out.println("Enter items price");
		log.info("Enter items price  ");
		int price=sc.nextInt();
		Item item=new Item();
		
		item.setSection(section);
		item.setitemsName(itemsName);
		item.setBrandName(brandName);
		item.setPrice(price);
		ItemDAO.insertion(item);

	}

}

