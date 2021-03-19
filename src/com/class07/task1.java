package com.class07;

public class task1 {

	public static void main(String[] args) {
		
		/*
		 * Print numbers from 1 to 100 in 1 line with space
		 * Print numbers from 100 to 1
		 * Print even numbers from 20 to 100
		 */

		int num=1;
		
		while(num<=100) {
		System.out.print(num+" ");
		num++;
	}
		System.out.println();
		System.out.println("------Print even numbers from 20 to 100-------------");
		num=100;
	while(num>=1) {
		
		System.out.print(num+" ");
		num--;
	}
	System.out.println();
	System.out.println("-----Print even numbers from 20 to 100");
	
	int e=20;
			
	while (e<=100) {
	System.out.print(e+" ");
	e+=2;
	
	
	}

	System.out.println();
	System.out.println("-----Print even numbers from 20 to 100");
	
	int a=20;
			
	while (a>=100) {
		
		if(a%2==0) {
	System.out.print(a+" ");
	
		}
		a++;
		
	}
	System.out.println("End of code");
	System.out.println("----------------");
	
	/*
	 * I want to capture your name 5 times and say hello to you
	 * 
	 */
	}
}
