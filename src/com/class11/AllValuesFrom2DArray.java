package com.class11;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {
		
		String[][] usa= {
		                {"Alexandria","Oakton","Alrington","Virginia Beach"+"Fairfax"},
		                {"Philly","Strassburg","Pittsburg"},
		                {"Boston","Quinc","Springfield","Burlington"},
		                {"Los Angeles","Long Beach","San Francisco","Sacrameto","Santa Barbara"},
		                {"Miami","Orlando","Tampa","Tallahasee"}
	};
		System.out.println(usa.length);//5 total single arrays / 5 rows total
		System.out.println(usa[0].length);//5 elements inside 1 array / 5 columns in 1 row
		System.out.println(usa[1].length);// 3 elements inside 2 array / 3 columns in 2 row
		System.out.println(usa[2].length);// 4 elements inside 3 array / 3 columns in 3 row
		
		for(int r=0; r<usa.length; r++) {//iterates over row
			
			for(int c=0; c<usa[r].length; c++) {
				System.out.print(usa[r][c]+" ");
			}
			System.out.println();
		}
	
	
	}

}
