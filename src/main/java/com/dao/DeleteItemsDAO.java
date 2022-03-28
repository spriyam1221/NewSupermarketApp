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
		statement.setString(1, brandName);
		int rows = statement.executeUpdate();
		System.out.println("no of brands deleted" + rows);

	}

	public static void itemsDeletionBysection(String section) throws SQLException, ClassNotFoundException {
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
