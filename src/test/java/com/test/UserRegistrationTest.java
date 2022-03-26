package com.test;

import java.util.Scanner;

import com.logic.ValidateUserRegistration;
import com.model.UserRegistration;

public class UserRegistrationTest {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
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

}
