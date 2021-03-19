package com.class11;

public class TwoDArrayIntro {

	public static void main(String[] args) {
	   
		
int[][] num=new int[3][4];
		
		//1 array or 1 row
		
		num[0][0]=1;
		num[0][1]=2;
		num[0][2]=3;
		num[0][3]=3;
		
		//2 array or 2 row
		
		num[1][0]=10;
		num[1][1]=20;
		num[1][2]=30;
		num[1][3]=40;
		
		//3 array or 3 row
		num[2][0]=100;
		num[2][1]=200;
		num[2][2]=300;
		num[2][3]=400;
		
		//int[] num={1,2,3,55,67}; short way
		
		System.out.println(num[1][2]);//40
		
		System.out.println(num[2][2]);
		

	}

}
