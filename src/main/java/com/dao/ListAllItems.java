package com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Items;

public class ListAllItems {
	public static List<Items> allitems() throws SQLException, ClassNotFoundException {
		List<Items> item = new ArrayList<Items>();
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
		Items items = null;
		while (result.next())
		{
			items = new Items();
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

}
