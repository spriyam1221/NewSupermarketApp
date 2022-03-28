package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AllItemsDAO {

	public static void allItems() throws SQLException, ClassNotFoundException {

		Connection connection;
		PreparedStatement statement;
		ResultSet rs;
		connection = ConnectionUtil.databaseConnection();
		String query = "select items_name,price from SuperMarket_items";

		statement = connection.prepareStatement(query);
		rs = statement.executeQuery();
		String itemsName = null;
		Integer price=0;
		while (rs.next()) {
			itemsName = rs.getString("items_name");
			price = rs.getInt("price");
			System.out.println(itemsName);
			System.out.println(price);
		}

	}

}
