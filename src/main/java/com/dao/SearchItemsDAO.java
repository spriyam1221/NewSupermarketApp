package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchItemsDAO {
	
	public static void searchItems() throws SQLException, ClassNotFoundException {

	
	Connection connection;
	PreparedStatement statement;
	ResultSet rs;
	connection = ConnectionUtil.databaseConnection();
	String query = "select items_name from SuperMarket_items";

	statement = connection.prepareStatement(query);
	rs = statement.executeQuery();
	String itemsName = null;
	while (rs.next()) {
		itemsName = rs.getString("items_name");
		System.out.println(itemsName);
	}
}
}

