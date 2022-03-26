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
		String query = "select name from Supermarket_App_User";

		statement = connection.prepareStatement(query);
		rs = statement.executeQuery();
		String name = null;
		while (rs.next()) {
			name = rs.getString("name");
			System.out.println(name);
		}

	}

}
