package com.class14;

import java.sql.SQLOutput;

public class MoreMethodsTester {

	public static void main(String[] args) {
		
		MoreMethodExamples obj1=new MoreMethodExamples();
		
		System.out.println(obj1.print());
		System.out.println(obj1.doubleTheValue(10));
		obj1.isRainig(false);
		//System.out.println(obj1.isRainig(false));error as we are no returning anything
		
		obj1.print5Times();
		System.out.println(obj1.returnGreater(122,56));
		obj1.printEvenOdd(5);
		
		double [] arr= {10.2,25,30};
		
		System.out.println(obj1.returnTheArraySum(arr));
		
		obj1.isMirror("aba");
		obj1.isMirror("abcdef");
		

	}

}
