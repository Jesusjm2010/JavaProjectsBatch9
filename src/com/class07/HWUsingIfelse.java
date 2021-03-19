package com.class07;

import java.util.Scanner;

public class HWUsingIfelse {

	public static void main(String[] args) {
		
		Scanner scan;
		int num1,num2, result;
		char operator=0;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter 2 numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println("Please enter the operation you would like to proform");
		operator = scan.next().charAt(0);
		
		if(operator=='+') {
		
		}else if (operator=='+') {
			result=num1 + num2;
		}else if (operator=='-') {
			result=num1 - num2;
		}else if ( operator=='*') {
			result=num1 * num2;
	
		}else if(operator== '/'){
			result=num1 / num2;
			
		}else {
			System.out.println("you enter invalid operator");
			
		}
		
		System.out.println("Base on your input "+num1+""+ operator+ ""+num2+ " equal to ");

	}

}
