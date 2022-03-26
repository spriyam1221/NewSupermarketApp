package com.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.DeleteItemsDAO;

public class DeleteItemsTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1)Delete by productName");
		System.out.println("2)Delete by brandName");
		System.out.println("3)Delete by categeory");
		int option=sc.nextInt();
		if(option==1)
		{
			System.out.println("Enter product name to delete");
			Scanner sc1 = new Scanner(System.in);
			String productName=sc1.nextLine();
			DeleteItemsDAO.itemsDeletionByItemsName(productName);
		}
		else if(option==2)
		{
			System.out.println("Enter product brand to delete");
			Scanner sc1 = new Scanner(System.in);
			String brandName=sc1.nextLine();
			DeleteItemsDAO.itemsDeletionByBrandName(brandName);
		}
		else if(option==3)
		{
			System.out.println("Enter product category to delete");
			Scanner sc1 = new Scanner(System.in);
			String category=sc1.nextLine();
			DeleteItemsDAO.itemsDeletionBycategory(category);
		}

	}

} 
 

