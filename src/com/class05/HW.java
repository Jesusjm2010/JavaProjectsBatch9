package com.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {

     /*Create a Java program that will ask if user has a credit card or not.
      * if you user does not have a credit card then offer them. If they do have one ask
      * what is the balance of the card? If balance of the card is larger than 1000,
      * 
      * 
      * 
      */
      
		
		String creditCard;
		double balance;
		Scanner scan;
		
		scan=new Scanner(System.in);
		
		System.out.println("Do you have a credit card");
		
		creditCard=scan.next();
		
		if (creditCard.equals("yes")) {
			
			System.out.println("what is the balance on the cc");
			
			balance=scan.nextDouble();
			
			if (balance>1000) {
				System.out.println("pay off immediately");
			}
		}else {
			System.out.println("would you like a credit card");
		}
		
			
	}

}
