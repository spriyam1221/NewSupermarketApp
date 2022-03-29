package com.supermarketapp.dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.supermarketapp.model.User;
import com.supermarketapp.util.ConnectionUtil;

public class UserDAO {
	private static Logger log = LogManager.getLogger( UserDAO.class);
	
	public static void regiatration(User user) throws ClassNotFoundException, SQLException
	{
		Connection connection=ConnectionUtil.databaseConnection();
		PreparedStatement statement=null;
		String query="insert into Supermarket_App_User (NAME,email,PASSWORD,mobile_number)values(?,?,?,?)";
		statement=connection.prepareStatement(query);
		statement.setString(1,user.getName());
		statement.setString(2,user.getEmail());
		statement.setString(3,user.getPassword());
		statement.setString(4,user.getMobileNumber());
		int rows=statement.executeUpdate();		
		System.out.println( "welcome to SuperMarket");
		log.info("welcome to SuperMarket");
		//AllItemsDAO.allItems();
	}
	public static void login(String email,String password) throws SQLException, ClassNotFoundException
	{
		Connection connection=ConnectionUtil.databaseConnection();
		PreparedStatement statement=null;
		String query="select email,password from Supermarket_App_User where email=?";
		statement=connection.prepareStatement(query);
		statement.setString(1,email);
		ResultSet result=statement.executeQuery();
		System.out.println(email);
		log.debug(email);
		System.out.println(password);
		log.debug(password);
		String Password=null;
		String mail=null;
		if(result.next())
		{
			mail=result.getString("email");
			Password=result.getString("password");


		}
		if(mail==null)
		{
			System.out.println("no records found");
			log.info("no records found");
		}
		else if(Password.equals(password))
		{
			System.out.println("welcome to SuperMarketApp");
			log.info("welcome to SuperMarketApp");
		}
		else
		{
			System.out.println("Invalid credentials");
			log.info("Invalid credentials");
		}

	}
	public static void allUsers() throws SQLException, ClassNotFoundException {
		
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

