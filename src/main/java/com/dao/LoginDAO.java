package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginDAO {
	public static void loginValidation(String email,String password) throws SQLException, ClassNotFoundException
	{
		Connection connection=ConnectionUtil.databaseConnection();
		PreparedStatement statement=null;
		String query="select email,password from Supermarket_App_User where email=?";
		statement=connection.prepareStatement(query);
		statement.setString(1,email);
		ResultSet result=statement.executeQuery();
		System.out.println(email);
		System.out.println(password);
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
		}
		else if(Password.equals(password))
		{
			System.out.println("welcome to SuperMarketApp");
		}
		else
		{
			System.out.println("Invalid credentials");
		}

	}

}

	
	


 

