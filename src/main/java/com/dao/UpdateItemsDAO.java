package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateItemsDAO {
	public static void itemsUpdateByitemName(int price, String itemsName) throws SQLException, ClassNotFoundException
	{
		Connection connection ;
        PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query =  "update  SuperMarket_items set price = ? where items_Name  = ? " ;
		statement = connection.prepareStatement(query);
		statement.setInt(1,price); 
		statement.setString(2,itemsName);

		int rows=statement.executeUpdate();
		System.out.println(" No of rows product updated : "+rows);
	}
	public static void itemsUpdateByBrandName(int price,String brandName) throws SQLException, ClassNotFoundException
	{
		Connection connection ;
        PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query =   "update SuperMarket_product set price = ?  where brand_Name = ?" ;
		statement = connection.prepareStatement(query);
		statement.setInt(1,price);
		statement.setString(2,brandName); 

		int rows=statement.executeUpdate();
		System.out.println(" No of  brandName updated : "+rows);

	}
	public static void itemsUpdateBycategory(int price,String category) throws SQLException, ClassNotFoundException
	{
		Connection connection ;
        PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query =   "update SuperMarket_product set price = ? where category = ?" ;
		statement = connection.prepareStatement(query);
		statement.setInt(1,price);
		statement.setString(2,category); 
		int rows=statement.executeUpdate();
		System.out.println(" No of  category updated : "+rows);


}


}
