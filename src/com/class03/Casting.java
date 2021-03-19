package com.class03;

import java.sql.SQLOutput;

public class Casting {

	public static void main(String[] args) {
		
		//int i=10.99; type mismatch
		
		//widening or implicit casting
		double d=10;
		System.out.println(d);
		
		//casting in Jave = converting a data type to another
         
		//2 types;
		
		
		/*widening/implicit (automatically)
		 * 
		 * byte-->short->int->long->float->double
		 * 
		 * narrowing/explic
		 * 
		 * double->float->long->int->short->byte
		 * 
		 */
		
		//narrowing or explicit casting
		int i=(int)12.99;
		System.out.println(i);
		
		byte b=(byte)130;
		
		System.out.println(b);
		
		int cakePiece=11;
		cakePiece /=4;
		System.out.println(cakePiece);//2
		
		   int number=12;
		   double result=number/5;
		   System.out.println(result);//2.0
		   
		   double newNum=10;
		   newNum=newNum/3;
		   System.out.println(newNum);
		   
		   //int num1=10+10.5;
		   
		   double num1=10+10.5;
		   
		   System.out.println(num1);
		   
		
		
	}
	

}
