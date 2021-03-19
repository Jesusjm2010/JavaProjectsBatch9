package com.class08;

public class FoorLoopReview {

	public static void main(String[] args) {
		
		/*
		 * I want to create a multiplication table
		 * 
		 * 1*1=1
		 * 1*2=2
		 * 1*3=3
		 * 1*4=4
		 * 1*5=5
		 * 1*6=6
		 * 1*7=7
		 * 1*8=8
		 * 1*9=9
		 * 1*10=10
		 * 
		 */
		
		int num=1;
		int mult;
		
		for (int i=1; i<=10; i++) {
			mult=num*i;
			System.out.println(num+"*"+i+"="+mult);
			
		}
		System.out.println("------exmp-------");
		
		int num2=7;
		int mult2;
		
		for (int i=1; i<=10; i++) {
			mult2=num2*i;
			System.out.println(num2+"*"+i+"="+mult2);
		

	
	}
	System.out.println("------exmp 2-------");
	
	int num3=3;
	int mult3;
	
	for (int i=1; i<=10; i++) {
		mult3=num3*i;
		System.out.println(num3+"*"+i+"="+mult3);
	
	}
}

}
