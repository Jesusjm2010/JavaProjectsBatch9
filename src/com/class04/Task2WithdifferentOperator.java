package com.class04;

public class Task2WithdifferentOperator {

	public static void main(String[] args) {


		double rate=5.1;
		int price=1000000;
		
		if (rate<4.5) {
			System.out.println("I am considering buying");

		}else {
			System.out.println("I am not buying");
			
			if (price>200000) {
		
			System.out.println("I will need a loan");
			
		}else {
			System.out.println("I am not buying");
		}
		}

	}

}
