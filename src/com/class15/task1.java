package com.class15;

import java.util.Scanner;
  public class task1 {
	public static void main(String[] args) {
		
		/*
		 * Accept username, password and confirm password from a user and check following requirements:
		 * Username and Password cannot be  empty, if so→ message="Username and Password cannot be empty".*
		 * Password should be minimum 8 characters, if less → message="Password is too short".
		 * Password cannot contain username if so, → message="Password cannot contain username".
		 * Password should match confirmed password, if not  → message="Passwords do not match".
		 * Only after all requirements met → message "Your username and password has been created"
		 * 
		 */
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter username");
		String userName=s.next();
		System.out.println("Enter password");
		String password=s.next();
		System.out.println("Re-enter the password");
		String password1=s.next();
		
		if(userName.isEmpty()|| password.isEmpty()) {
			System.out.println("Username or password cannot be empty");
		}else if(password.length()<8) {
			System.out.println("Password is too short");
		}else if(password.contains(userName)) {
			System.out.println("password cannot contain Username");
		}else if(!(password.equals(password1))) {
			System.out.println("Passwords dont match");
			
		}else {
			System.out.println("Your username and password are created");
			
		}
		

	}

}
