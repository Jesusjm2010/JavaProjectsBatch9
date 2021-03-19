package com.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		/*We have to identify if number is mall, medium. large, xlarge
		 * if number is between 1 and 10 -->small
		 * if number is between 11 and 100 -->medium
		 * if number is between 101 and 1000 -->larger
		 * if number is between 1001 TILL 10000 ----->Xlarge
		 */
		
		int num=100;
		
		if (num>1 && num<10) {
			
			System.out.println(num+" is a small number");
				
			}else if (num>=11 && num<=100) {
				
				System.out.println(num +" is a medium number");
				
		}else if(num>=101 && num<=1000) {
			
			System.out.println(num+" is a large number");
		
	}else if(num>=1001 && num<=10000) {
		
		System.out.println(num +" is a xlarger number");
	}else {
		System.out.println(num+" is a hug number");
		
	}
	}

}
