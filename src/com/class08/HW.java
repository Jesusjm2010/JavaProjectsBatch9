package com.class08;

public class HW {

	public static void main(String[] args) {
		
		/*
		 * calculate sum of odd and even numbers from 1 to 50 
		 */
		System.out.println("------one way-------");
		 int sumEven=0;
		 
		for(int a=1; a<=50; a+=2) {
			 sumEven+=a;
				
			
			
		}
		System.out.println("The sum of even numbers is"+sumEven);
			
			System.out.println();
			System.out.println("---------odd numbers---------");
		
			 int sumOdd=0;
			 
				for(int a=1; a<=50; a+=2) {
					 sumOdd+=a;
					 
						
		    	}
				System.out.println("The sum of odd numbers is"+sumOdd);
				
				System.out.println("-----best way to do it--------");
				
				int odd=0;
				int even = 0;
				
				for (int i=1; i<=50; i++) {
					
					if(i%2==0) {
						even+=i;
					}else {
						odd+=i;
					}
				
			}
		    System.out.println("Sum of odd numbers equals to "+ odd);
		    System.out.println("Sum of even numbers equals to "+ even);
		    	 
		     
		     
		
	}

}
