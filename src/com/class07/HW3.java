package com.class07;
import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		
		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 *  operator(+,-,*,/). Based on operator provide the result to user.
		 * 
		 */
		
		Scanner scan;
		int num1,num2, result;
		char operator=0;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter 2 numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println("Please enter the operation you would like to proform");
		operator = scan.next().charAt(0);
		
		switch(operator) {
		
		case '+':
			result=num1 + num2;
			break;
		case '-':
			result=num1 - num2;
			break;
		case '*':
			result=num1 * num2;
			break;
		case '/':
			result=num1 / num2;
			break;
			default:
			result=0;
		}
		
		System.out.println("Base on your input "+num1+""+ operator+ ""+num2+ " equal to "+result);

	}

}
