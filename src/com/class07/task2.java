package com.class07;

public class task2 {

	public static void main(String[] args) {
		
		/*
		 * Print numbers from 1 to 100 in 1 line with space
		 * Print numbers from 100 to 1
		 * Print even numbers from 20 to 1 (2 ways)
		 * Print odd numbers between 20 and 50 (2 ways)
		 */
		
		for(int a=1; a<=100; a++) {
			System.out.print(a+" ");
			
		}
		System.out.println();
		System.out.println("------Print from 100 t0 1");
		
		for(int a=100; a>=1; a--) {
			System.out.print(a+" ");
			
		}
		System.out.println();
		System.out.println("------Print from 20 t0 1 (2 ways)");
		
		for (int a=1; a<=20; a++) {
			System.out.print(a+" ");
			
		}
		System.out.println();
		
		System.out.println("------Print from 20 t0 50 (2 ways)");
		
		for (int a=20; a<=50; a++) {
			if(a%2==0) {
				System.out.println(a+" ");
			}
		}
		System.out.println();
		System.out.println("------Print from 20 t0 50 (2 ways)");
			
			for (int a=20; a<=50; a+=2) {
				System.out.print(a+" ");
		}
			System.out.println();
			System.out.println("------What is the output-----");
			
			int sum=0;
			
			for(int i=1; i<=5; i++) {
				sum=sum+i;
			}
			System.out.println(sum);
			System.out.println();
		
	
	     
	     System.out.println("------What is the output-----");
	     
	     int result=0;
	     
	     for (int i = 2; i < 10; i+=2) {
	    	 
	    	 result+=i;
	    	 
	    	 System.out.println(result);
    }
	     System.out.println(result);
}

}
