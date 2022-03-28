package com.supermarketapp.validation;


import com.supermarketapp.dao.UserDAO;
import com.supermarketapp.model.User;

public class ValidateUser {
	public  void validatingRegistration(User user) throws Exception {
		int NameValid = nameValidation(user.getName());
		int EmailValid = userEmailValidation(user.getEmail());
		int PasswordValid = userPasswordValidation(user.getPassword());
		int MobileNumberValid = userMobileNumberValidation(user.getMobileNumber());
                if (NameValid+ EmailValid + PasswordValid+ MobileNumberValid == 4) {
		
                	UserDAO.regiatration(user);

		} else {
			throw new Exception("Please Re-Enter Your Details");
		}
	}

	public static int nameValidation(String Name) throws Exception {
		if (Name != null) {
			return 1;
		} else {
			throw new Exception("Enter a valid Name");
		}
	}

	

	public static int userMobileNumberValidation(String mobileNumber) throws Exception {
		int result = 0;
		char[] mobile = mobileNumber.toCharArray();
		int count = 0;
		if (mobile.length > 10 || mobile.length < 10) {
			throw new Exception("Mobile Number Must Be 10 Digits Long");
		} else {
			count++;
		}
		for (char i : mobile) {
			if (Character.isAlphabetic(i)) {
				throw new Exception("Enter only Numeric values");
			} else {
				count++;
			}
		}
		if (count == 11)
		{

				result=1;
		}

		else 
		{
			throw new Exception("Please Enter a Valid Mobile Number");
		}
		return result;
}


	public static int userEmailValidation(String email) throws Exception {
		int result = 0;
		if (email.contains("@")||email.contains("gmail")||email.contains(".com")) {
				
			       result=1;
			}
	   else 
	   {
			throw new Exception("Enter a valid Email address");
		}
		
		return result;
	}

	public static int userPasswordValidation(String password) throws Exception {
		if (password.length() < 8 && password.length() < 16){
			throw new Exception("Password must be 8 or 16 characters long");
		} else {
			return 1;
		}
	}

}
 