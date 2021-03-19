package com.class12;

public class scondLargestNumberInArray {

	public static void main(String[] args) {
		
		/*
		 * Write a java program to find the second largest number in the array?
		 */
		
		//create 2 variables to hold largest and second largest
		
		int largest = 0;
		int secondLargest=0;
		
		int[] arr= {900,2,60,13,27};
		
		for(int i = 0; i<arr.length; i++){
			
			if(arr[i]>largest) {
				secondLargest = largest;
				largest= arr[i];
				
			}else if(arr[i]>secondLargest) {
				secondLargest = arr[i];
			}
			
			
		}
		
		System.out.println("The second Largest number is "+secondLargest);
		
		
	      
	}
		}
	
		


