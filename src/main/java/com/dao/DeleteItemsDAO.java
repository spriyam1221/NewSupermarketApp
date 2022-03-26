package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteItemsDAO {
	public static void itemsDeletionByItemsName(String itemsName) throws SQLException, ClassNotFoundException {
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query = "delete from SuperMarket_items where items_name = ? ";
		statement = connection.prepareStatement(query);
		statement.setString(1, itemsName);
		int rows = statement.executeUpdate();
		System.out.println("no of items deleted " + rows);

	}

	public static void itemsDeletionByBrandName(String brandName) throws SQLException, ClassNotFoundException {
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query = "delete from SuperMarket_items where brand_name = ?";
		statement = connection.prepareStatement(query);
		statement.setString(2, brandName);
		int rows = statement.executeUpdate();
		System.out.println("no of brands deleted" + rows);

	}

	public static void itemsDeletionBycategory(String category) throws SQLException, ClassNotFoundException {
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query = "delete from SuperMarket_items  where category = ?";

		statement = connection.prepareStatement(query);
		statement.setString(3, category);

		int rows = statement.executeUpdate();
		System.out.println("no of category deleted" + rows);

	}


}
