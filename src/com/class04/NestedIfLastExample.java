package com.class04;

public class NestedIfLastExample {

	public static void main(String[] args) {
		
		/*
		 * to donate:
		 * you must be 18 or older, otherwise you cannot donate
		 * your weight must be more then 110 lbs, otherwise you cannot donate
		 * 
		 */
		
		int age=18;
		int weight =140;
		
		if(age>=18) {
			System.out.println("you are eligable to donate");
			{
				
			} if(weight>110) {
			
				System.out.println("you can donate");
				
				}else {
					System.out.println("you weight is to small, you can not donate");
				}
		}else {
			System.out.println("you cannot donate");
			
			
		}
	
		

	}

}
