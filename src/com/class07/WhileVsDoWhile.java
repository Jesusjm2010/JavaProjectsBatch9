package com.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		
		int num=6;
		
		while(num<=5) {// while loop is used in programming compare to do while!!!!
			System.out.println(num);
			num++;
		}
		
		System.out.println("------Do while----------------");
		
		int num1=6;
		
		do {
			
			System.out.println(num1);
			
			num1++;
		}while(num1<=5);
		
		/*
		 * while = first check then execute
		 * 
		 * do=first execute then check
		 * 
		 * even when condition is false Do will execute your code at least ONCE
		 */
	
				

	}

}
