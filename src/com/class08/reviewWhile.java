package com.class08;

import java.util.Scanner;

public class reviewWhile {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int money;
		
		System.out.println("Please pay for the soda");
		money=scan.nextInt();
		
		while(money !=3) {
			
			if (money<2) {
				System.out.println("please give more money");
			}else if(money>3) {
				System.out.println("Please give less money");
			}
			
			money=scan.nextInt();
		}
		
          System.out.println("Thank you for yout purchase");
	}

}
