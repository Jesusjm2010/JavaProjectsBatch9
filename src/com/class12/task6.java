package com.class12;

public class task6 {
	
	/*
	 * 
	 * Write a java program to check whether a given number is prime or not?
	 * 
	 */

	public static void main(String[] args) {
		
		int num = -100;
		boolean prime=true;
		
		for(int i=2; i<num; i++) {
			
			if(num%i==0) {
				prime=false;
				break;
				
			}
		}
		if(prime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+ " is NOT a prime number");
		}
	}

}
