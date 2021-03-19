package com.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		
		/*We need to identify favorite food
		 * 
		 * we need to capture country from a user
		 * based on the country identify favorite food
		 * 
		 */
		
		Scanner input;
		String country, food;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your country");
		
		country=input.nextLine();
		
		switch (country) {
		
		case "USA":
			food="burger";
			break;
			
		case "Afghanistan":
			food="Kebab";
			break;
			
		case "Vietam":
			food="Pho";
			break;
			
		case "Poland":
			food="Piergoi";
			break;
			
		case "Kazakstan":
			food="horse";
			break;
			
		case "Belarus":
			food="draniki";
			break;
			
		case "Tajikistan":
			food="plov";
			break;
			
		case "Mexico":
			food="tacos";
			break;
			
			default:
				food="unknown";
		}
		
		System.out.println("Your favorite food "+food);
	}

}
