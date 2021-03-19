package com.class02;

import java.awt.SystemColor;

public class ArtihmeticOperatos {

	public static void main(String[] args) {
		
		
		int num1=10;
		int num2=5;
		
		//+,*,/,-,%
		
		System.out.println(num1+num2);
		System.err.println(num1-num2);
		

		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		//sum of number 10 and 5 is = 15
		
		System.out.println("Sum of number "+num1+" and "+num2+" is = "+ sum);
		System.out.println("sum of number 10 and 5 is =15");
		
		double number1=10.99;
		double number2=90.99;
		
		double sumOfDouble=number1+number2;
		double subOfDouble=number1-number2;
		double divOfDouble=number2/number1;
		
		System.out.println("Result if division of double values "+divOfDouble);
		
		float n1=10.99F;
		float n2=90.99F;
		
		float divOfFloat=n2/n1;
		
		System.out.println("Result of divison of 2 float values " +divOfFloat);
		
		float num3=27.18F;
		float num4=10.84F;
		
		float sum1=num3+num4;
		float sub2=num3-num4;
		float mult2=num3*num4;
		float div2=num3/num4;
		
		System.out.println("The addition of 2 numbers "+num3+" and "+num4+" is equal to "+sum1);
		
		System.out.println("The substuction of 2 numbers "+num3+" and "+num4+"is equal to "+sub2);
		
		System.out.println("the multiplication of 2 numbers "+num3+" and "+num4+" is equal to "+mult2);
		
		System.out.println("the division of 2 numbers "+num3+" and "+num4+" is equal to "+div2);
		
		//precedence ()-->*&/ --> +&- 
		
		//modulus operator --> shows reminder of division
		
		int mod=10%3;
		System.out.println("Remainder is = "+mod);
		
		int mod1=10%2;
		
		System.out.println("Remainder is = "+mod1);
		
		int mod2=15%4;
		System.out.println("Remainder is = "+mod2);
		
		int r=20%7*3;
		
		System.out.println();
		
		System.out.println();
	}

}
