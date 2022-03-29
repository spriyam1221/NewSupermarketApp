package com.supermarketTest.modelTest;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.supermarketapp.dao.UserDAO;
import com.supermarketapp.model.User;

public class UserTest {
	private static Logger log = LogManager.getLogger(UserTest.class);
	public static void main(String[] args) throws Exception {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("1-->UserRegistration");
		log.info("1-->UserRegistration");
		System.out.println("2-->Login");
		log.info("2-->Login");
		int num=sc.nextInt();
		
		if(num==1) {
			
		System.out.println("Enter your name");
		log.info("Enter your name");
		String name = sc.next();
		
		System.out.println("Enter your email");
		log.info("Enter your email");
		String email = sc.next();
		
		System.out.println("Enter your MobileNumber");
		log.info("Enter your MobileNumber");
		String mobileNumber = sc.next();
		
		System.out.println("Enter your password");
		log.info("Enter your password");
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
			
			log.error(e.getMessage());
		}
		}
if(num==2) {
	//Scanner sc=new Scanner(System.in);
	System.out.println("Enter your email");
	log.info("Enter your email");
	String email=sc.next();
	System.out.println("Enter your password");
	log.info("Enter your password");
	String password=sc.next();
	UserDAO.login(email, password);
	
}
	}
	
	}
