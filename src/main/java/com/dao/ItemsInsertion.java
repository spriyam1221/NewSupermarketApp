package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Items;

public class ItemsInsertion {
	public static void itemsinsertion(Items items) throws ClassNotFoundException, SQLException
	{
		Connection connection=ConnectionUtil.databaseConnection();
		PreparedStatement statement=null;
		String query="insert into SuperMarket_items(category,items_name,brand_name,price)values(?,?,?,?)";
		statement=connection.prepareStatement(query);
		statement.setString(1, items.getCategory());
		statement.setString(2, items.getitemsName());
		statement.setString(3, items.getBrandName());
		statement.setInt(4, items.getPrice());
		int rows=statement.executeUpdate();		
		System.out.println("Items are inserted");
	}



}
