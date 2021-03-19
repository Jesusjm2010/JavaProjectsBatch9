package com.class05;

public class IfWithNoBraces {

	public static void main(String[] args) {
		
		System.out.println("-----If without braces--------");
		
		
         String day="Friday";
		
		if(day.equals("Friday"))
			System.out.println("Today is my movie day");
		System.out.println("Tomorrow I have a class at Syntax");
		
		System.out.println("-----End of the Program-------");
		
		
		
		
		
		
		System.out.println("-----If with braces--------");//always use braces
		
	
		
		if(day.equals("Friday")) {
			System.out.println("Today is my movie day");
		System.out.println("Tomorrow I have a class at Syntax");
		
		}
		System.out.println("-----End of the Program-------");
		
		int num=10;
		
		if (num>10)
			
			System.out.println("number is larger than 10");
		else // if no braces jave identifies only 1 statement per block (if block or else block)
			System.out.println("Number is less than 10");
		    System.out.println("Second statemnt inside else block");

	}

}
