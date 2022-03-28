package com.supermarketTest.modelTest;

import java.util.Scanner;


import com.supermarketapp.dao.AllItemsDAO;
import com.supermarketapp.dao.UserDAO;
import com.supermarketapp.model.User;

public class UserTest {
	public static void main(String[] args) throws Exception {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("1-->UserRegistration");
		System.out.println("2-->Login");
		int num=sc.nextInt();
		
		if(num==1) {
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your email");
		String email = sc.next();
		System.out.println("Enter your MobileNumber");
		String mobileNumber = sc.next();
		System.out.println("Enter your password");
		String password = sc.next();
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setMobileNumber(mobileNumber);
		try {

			UserDAO.regiatration(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}
if(num==2) {
	//Scanner sc=new Scanner(System.in);
	System.out.println("Enter your email");
	String email=sc.next();
	System.out.println("Enter your password");
	String password=sc.next();
	UserDAO.login(email, password);
	
}
	}
	
	}
