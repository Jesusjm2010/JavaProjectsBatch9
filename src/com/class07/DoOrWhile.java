package com.class07;

import java.util.Scanner;
public class DoOrWhile {

	public static void main(String[] args) {
		
		/*
		 * we playing the lottery and we have a winning number which is 17
		 * we need to keep asking a user to enter any number from 1-100
		 * Until the winning number is entered
		 */
		
		Scanner input;
		int num;
		int lotteryNumber=17;
		
		input=new Scanner(System.in);
		
		
		do {
			System.out.println("Please Enter any number from 1 to 100 to win the lottery");
			num=input.nextInt();
		}while(num!=lotteryNumber);
		System.out.println("Congratulation you enter "+num+" which is a lucky number");

	}

}
