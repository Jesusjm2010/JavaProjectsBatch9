package com.class06;

public class NotOperator {

	public static void main(String[] args) {
		
		boolean rain=true;
		
		if(!rain) {
			System.out.println("I will go to the park");
		}
		
		boolean boo=!true;
				
				System.out.println(boo);//false
				
				boolean boo1=!false;
				System.out.println(boo1);
				
				boolean traffic=false;
				
				if(!traffic) {
					System.out.println("I will come on time");
				}
				
				String day="Friday";
				
				if(!day.equals("Monday")) {
					System.out.println("Today is not Friday");
				}
				System.out.println("---------------------------------------");
				
				//Not operator !---> always places before the condition
				boolean homeWork=false;
				
				if(!homeWork) {
					System.out.println("I Will be happy");
				}
				

	}

}
