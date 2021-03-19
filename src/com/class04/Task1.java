package com.class04;

public class Task1 {

	public static void main(String[] args) {
		
		boolean diploma=true;
		double gpa=3.7;
		
		if (diploma) {
			System.out.println("Congratulations");
				
		 if (gpa<=3.5) {
				System.out.println("You are eligible for a scholarship");
			}else {
				System.out.println("You should have studied harder");
				}
			
		}else {
			System.out.println("You will need to get a degree");
		}

	}

}
