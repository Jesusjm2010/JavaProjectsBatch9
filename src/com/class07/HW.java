package com.class07;
import java.util.Scanner;
public class HW {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		 * 
		 */
		
		String country,language;
		
		Scanner scan=new Scanner(System.in);
		 System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch (country) {
		
		case "Mexico":
			language="Spanish";
			break;
		case "USA":
			language="English";
			break;
		case "China":
		    language="Mandarin";
		    break;
		    default:
		    	language="Unkown";
		    	
			
		}
		
		System.out.println("people from "+country+" speak "+language);
				
	}
}