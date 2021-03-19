package com.class04;

public class MortgageRateAndMortgagePrice {

	public static void main(String[] args) {

 
		
		double rate=4.6;
		int price=190000;
		
		if (rate<4.5) {
			System.out.println("I will not buy a house");
			
		}else {
			System.out.println("Will consider buying");
		
			if (price>190000) {
			System.out.println("I will take out a loan");
			
			
		}else {
			System.out.println("I will pay cash");
		}
			
		}
		
	}

}
