package com.class06;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		/*
		 * we need to calculate final price after the discount
		 * 
		 * we check if we have a sale
		 * if no sale --> I'm not going shopping
		 * if there is a sale
		 *  we will ask for the item
		 *  we will ask for the price
		 *  
		 * if the price is less <10--> apply 5% discount
		 * if the price is between 10 and 100 -->> apply 10% discount
		 * if the price is between 100 to 500 --> apply 20% discount
		 * if the price is more than 500 --> apply 30%
		 *  
		 *  "which item you purchased, what was the original price, what discount was applied and final price"
		 */
		
		
		double price,discount=0, finalPrice=0;
		String item;
		Scanner scan=new Scanner(System.in);
		System.out.println("Do we have a sale today");
		
		boolean sale=scan.nextBoolean();
		
		if(!sale) {
			System.out.println("I'm not going shopping");
		}else {
			System.out.println("Do you have the item");
			item=scan.next();
			System.out.println("what is the price of the item");
			price=scan.nextDouble();
		
			if (price<10) {
				discount=price*0.05;
				
			}else if (price>=10 && price<100) {
				discount= price* 0.1;
				
			}else if (price>=100 && price <=500) {
				discount = price * 0.2;
				
			}else if (price>500) {
				discount=price *0.3;
				
			}
		
			finalPrice=price-discount;
		System.out.println("You are buying "+item+" with original price ="+price+" after discount "+discount+" your final price is ="+finalPrice);
		
		
		}

	
	}

}
