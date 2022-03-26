package com.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.LoginDAO;

public class LoginTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your mail");
		String email=sc.next();
		System.out.println("Enter your password");
		String password=sc.next();
		LoginDAO.loginValidation(email, password);

	}

}
