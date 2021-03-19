package com.class12;

public class task1 {

	public static void main(String[] args) {
		
int [][] numbers ={
				
				{1,2,3},
				{4,5,6},
				{7,8,9}
		
		};
		
		int sum=0;
		
		for(int row=0; row<numbers.length;row++) {
			for(int col=0; col<numbers.length;col++) {
				   sum+=numbers[row][col];
			
		}
		
		
		}
		System.out.println("2d array numbers Sum "+sum);
	}
}
 
	

	
		
	
	



		
		
	


