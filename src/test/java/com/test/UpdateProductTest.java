package com.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.UpdateItemsDAO;

public class UpdateProductTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("1)Update by product  ");
		System.out.println("2)Update by  product brand");
		System.out.println("3)Update by product category");
		int option=sc.nextInt();
		if(option==1)
		{
			System.out.println("Enter product price");
			int price =sc.nextInt();
			System.out.println("Enter product name");
		@SuppressWarnings("resource")
		Scanner sc1= new Scanner(System.in);
		String ProductName =sc1.nextLine();
		UpdateItemsDAO.itemsUpdateByitemName(price,ProductName);
		}
		else if(option==2)
		{
			System.out.println("Enter  brand price ");
			int price =sc.nextInt();
			System.out.println("Enter  brand name");
			@SuppressWarnings("resource")
			Scanner sc1= new Scanner(System.in);
		String brandName =sc1.nextLine();
		UpdateItemsDAO.itemsUpdateByBrandName(price,brandName);

		}
		else if(option==3)
		{
			System.out.println("Enter  category price ");
			int price =sc.nextInt();
			System.out.println("Enter  category name ");
			@SuppressWarnings("resource")
			Scanner sc1= new Scanner(System.in);
		String category =sc1.nextLine();

		UpdateItemsDAO.itemsUpdateBycategory(price,category);

		}

	}


} 

