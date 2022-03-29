package com.supermarketTest.daoTest;

import java.sql.SQLException;


import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.supermarketTest.modelTest.UserTest;
import com.supermarketapp.dao.ItemDAO;


public class UpdateitemTest {
	private static Logger log = LogManager.getLogger(UserTest.class);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("1)Update by items  ");
		log.info("1)Update by items  ");
		
		System.out.println("2)Update by  items brand");
		log.info("2)Update by  items brand");
		
		System.out.println("3)Update by items section");
		log.info("3)Update by items section");
		
		int option=sc.nextInt();
		if(option==1)
		{
			System.out.println("Enter items price");
			log.info("Enter items price");
			
			int price =sc.nextInt();
			System.out.println("Enter items name");
			log.info("Enter items name");
			
		@SuppressWarnings("resource")
		Scanner sc1= new Scanner(System.in);
		String itemsName =sc1.nextLine();
		ItemDAO.updateByitemName(price,itemsName);
		}
		else if(option==2)
		{
			System.out.println("Enter  brand price ");
			log.info("Enter  brand price");
			
			int price =sc.nextInt();
			System.out.println("Enter  brand name");
			log.info("Enter  brand name");
			
			@SuppressWarnings("resource")
			Scanner sc1= new Scanner(System.in);
		String brandName =sc1.nextLine();
		ItemDAO.updateByBrandName(price,brandName);

		}
		else if(option==3)
		{
			System.out.println("Enter  section price ");
			log.info("Enter  section price");
			int price =sc.nextInt();
			
			System.out.println("Enter  section name ");
			log.info("Enter  section name");
			
			@SuppressWarnings("resource")
			Scanner sc1= new Scanner(System.in);
		String section =sc1.nextLine();

		ItemDAO.updateBysection(price,section);

		}

	}


} 

