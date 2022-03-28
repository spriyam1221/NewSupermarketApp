package com.supermarketapp.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.supermarketapp.model.Item;
import com.supermarketapp.util.ConnectionUtil;

public class ItemDAO {
	public static List<Item> allitems() throws SQLException, ClassNotFoundException {
		List<Item> item = new ArrayList<Item>();
		Connection connection = ConnectionUtil.databaseConnection();
		PreparedStatement statement = null;
		ResultSet result = null;
		String query = "select id,section,items_name,brand_name,price from SuperMarket_items ";
		statement = connection.prepareStatement(query);
		result = statement.executeQuery();
		int id = 0;
		String section = null;
		String itemsName = null;
		String brandName = null;
		int price = 0;
		Item items = null;
		while (result.next())
		{
			items = new Item();
			id = result.getInt("id");
			section = result.getString("section");
			itemsName = result.getString("items_Name");
			brandName = result.getString("brand_Name");
			price = result.getInt("price");
		
			items.setId(id);
			items.setSection(section);
			items.setitemsName(itemsName);
			items.setBrandName(brandName);
			items.setPrice(price);
			item.add(items);
		}
		return item;

	}
	public static void insertion(Item items) throws ClassNotFoundException, SQLException
	{
		Connection connection=ConnectionUtil.databaseConnection();
		PreparedStatement statement=null;
		String query="insert into SuperMarket_items(section,items_name,brand_name,price)values(?,?,?,?)";
		statement=connection.prepareStatement(query);
		statement.setString(1, items.getSection());
		statement.setString(2, items.getitemsName());
		statement.setString(3, items.getBrandName());
		statement.setInt(4, items.getPrice());
		int rows=statement.executeUpdate();		
		System.out.println("Items are inserted");
	}
	public static void updateByitemName(int price, String itemsName) throws SQLException, ClassNotFoundException
	{
		Connection connection ;
        PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query =  "update  SuperMarket_items set price = ? where items_name  = ? " ;
		statement = connection.prepareStatement(query);
		statement.setInt(1,price); 
		statement.setString(2,itemsName);

		int rows=statement.executeUpdate();
		System.out.println(" No of rows product updated : "+rows);
	}
	public static void updateByBrandName(int price,String brandName) throws SQLException, ClassNotFoundException
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
	public static void updateBysection(int price,String section) throws SQLException, ClassNotFoundException
	{
		Connection connection ;
        PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query =   "update SuperMarket_product set price = ? where section = ?" ;
		statement = connection.prepareStatement(query);
		statement.setInt(1,price);
		statement.setString(2,section); 
		int rows=statement.executeUpdate();
		System.out.println(" No of  section updated : "+rows);


}
	public static void deletionByItemsName(String itemsName) throws SQLException, ClassNotFoundException {
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query = "delete from SuperMarket_items where items_name = ? ";
		statement = connection.prepareStatement(query);
		statement.setString(1, itemsName);
		int rows = statement.executeUpdate();
		System.out.println("no of items deleted " + rows);

	}
	public static void deletionByBrandName(String brandName) throws SQLException, ClassNotFoundException {
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query = "delete from SuperMarket_items where brand_name = ?";
		statement = connection.prepareStatement(query);
		statement.setString(1, brandName);
		int rows = statement.executeUpdate();
		System.out.println("no of brands deleted" + rows);

	}

	public static void deletionBysection(String section) throws SQLException, ClassNotFoundException {
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query = "delete from SuperMarket_items  where section = ?";

		statement = connection.prepareStatement(query);
		statement.setString(1,section);

		int rows = statement.executeUpdate();
		System.out.println("no of section deleted" + rows);

	}





}
