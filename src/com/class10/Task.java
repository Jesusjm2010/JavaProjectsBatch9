package com.class10;

public class Task {

	public static void main(String[] args) {
		
		/*
		 * Create an array of chars and store grades into it:A,B,C,D,E,F.
		 * Then print a grade B
		 */
		
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println("Your grade is "+grade[1]);
		
		System.out.println("--------------------Another way of creating an array-------------------");
		
		char[] grades= {'A','B','C','D','E','F','G','H'};
		
		System.out.println(grade[5]);
		System.out.println("numbers of elements in 2 array "+grades.length);

	}

}
