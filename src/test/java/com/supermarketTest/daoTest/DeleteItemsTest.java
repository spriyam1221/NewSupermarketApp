package com.supermarketTest.daoTest;

import java.sql.SQLException;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.supermarketTest.modelTest.UserTest;
import com.supermarketapp.dao.ItemDAO;

public class DeleteItemsTest {
	private static Logger log = LogManager.getLogger(UserTest.class);
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1)Delete by itemsName");
		log.info("1)Delete by itemsName");
		
		System.out.println("2)Delete by brandName");
		log.info("2)Delete by brandName");
		
		System.out.println("3)Delete by section");
		log.info("3)Delete by section");
		
		int option=sc.nextInt();
		if(option==1)
		{
			System.out.println("Enter product name to delete");
			log.info("Enter product name to delete");
			
			Scanner sc1 = new Scanner(System.in);
			String itemsName=sc1.nextLine();
			ItemDAO.deletionByItemsName(itemsName);
		}
		else if(option==2)
		{
			System.out.println("Enter product brand to delete");
			log.info("Enter product brand to delete");
			
			Scanner sc1 = new Scanner(System.in);
			String brandName=sc1.nextLine();
			ItemDAO.deletionByBrandName(brandName);
		}
		else if(option==3)
		{
			System.out.println("Enter product section to delete");
			log.info("Enter product section to delete");
			
			Scanner sc1 = new Scanner(System.in);
			String section=sc1.nextLine();
			ItemDAO.deletionBysection(section);
		}

	}

} 
 

