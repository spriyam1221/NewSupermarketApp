package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.UserRegistration;

public class UserRegistrationInsertion {
	
	public static void insertUser(UserRegistration registration) throws ClassNotFoundException, SQLException
	{
		Connection connection=ConnectionUtil.databaseConnection();
		PreparedStatement statement=null;
		String query="insert into Supermarket_App_User (NAME,email,PASSWORD,mobile_number)values(?,?,?,?)";
		statement=connection.prepareStatement(query);
		statement.setString(1,registration.getName());
		statement.setString(2,registration.getEmail());
		statement.setString(3,registration.getPassword());
		statement.setString(4,registration.getMobileNumber());
		int rows=statement.executeUpdate();		
		System.out.println( "welcome to SuperMarket");
		AllItemsDAO.allItems();
	}

}

