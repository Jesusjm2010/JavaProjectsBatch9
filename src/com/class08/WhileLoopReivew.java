package com.class08;

import java.util.Scanner;

public class WhileLoopReivew {

	public static void main(String[] args) {
		
		/*
		 * we need to make user to pay for a soda
		 * keep asking user to pay until enter 3
		 * 
		 * if user give more >3 --> please give less money
		 * if user give less >3 --> please give more money
		 * 
		 */
		System.out.println("-----do Review-----");
		Scanner scan;
		int num;
		int money=3;
		
		do {
		scan=new Scanner(System.in);
		System.out.println("please pay for soda");
		num=scan.nextInt();
		
		if(num<money) { 
		System.out.println("You diposite to much");
		
		}else if(num>money){
			System.out.println("You diposite to less");
		
		
		}
		
		
		}while (money!=3);
		
		System.out.println("you have disposit "+money+" Please take your soda");
	}
		

	

}
