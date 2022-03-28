package com.test;

import java.util.Scanner;

import com.dao.AllItemsDAO;
import com.dao.LoginDAO;
import com.logic.ValidateUserRegistration;
import com.model.UserRegistration;

public class UserRegistrationTest {
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
		UserRegistration registration = new UserRegistration();
		registration.setName(name);
		registration.setEmail(email);
		registration.setPassword(password);
		registration.setMobileNumber(mobileNumber);
		try {

			ValidateUserRegistration.validatingRegistration(registration);
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
	LoginDAO.loginValidation(email, password);
	
}
	}
	
	}
