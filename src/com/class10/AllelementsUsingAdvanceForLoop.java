package com.class10;

import javax.sql.rowset.serial.SQLOutputImpl;

public class AllelementsUsingAdvanceForLoop {

	public static void main(String[] args) {
		
		int[] numbers={10,14,78,5,90};
		
		// for each, enhanced for loop, advanced for loop 
		//USED ONLY WITH ARRAYS!!!!OR COLLECTIONS!!!
		
		for(int num:numbers) {
			
			System.out.print(" "+num);
			
			
			
		}
		System.out.println();
		  System.out.println("---------------------------------");
		  
		String[] names= {"Maria","Chris","Edwin","Emma","Brian","Kisanet","Melaku","Jesus"};
		
		for (int i=0; i<names.length; i++) {
			
			System.out.print(names[i]+" ");

	}
	  System.out.println();
	  System.out.println("---------------------------------");
	  
	  for(String n:names) {
		  
		  //if(n%2==0) {
		  
		  System.out.print(n+" ");
	  }
	  System.out.println();
	  System.out.println("---------------------------------");
	  
	  char[] grades= {'A','B','C','D','E','F','G','H'};
	  
	  for(char grade:grades) {
		  
		  System.out.print(grade+" ");
	  }
	  System.out.println();
	  System.out.println("---------------------------------");
	  
	  boolean[] boo= {true,false,false,false,true};
	  
	  for(boolean yes:boo) {
		  
		  System.out.print(yes+" ");
		  
	  }
	  
	  }
 
 }


