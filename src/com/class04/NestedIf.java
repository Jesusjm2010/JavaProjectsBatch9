package com.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean morning=true;
		
		boolean classToday=false;
		
		//is it morning?-->good morning
		  // if there is a class: yes--> hello classmates
		  //      otherwise-->hello my family
		
		if(morning) {
			System.out.println("Let me check if i have class today");
			if(classToday) {
				System.out.println("Good morning my classmates");
			}else{
			System.out.println("Good morning my family");
		}
          
        }
		
		System.out.println("-----End of code------");
		
		System.out.println("-------Example 2--------------");
		
		boolean anyAllergy=true;
		
		boolean pollenAllergy=true;
		
		if (anyAllergy) {
			System.out.println("Let's check which allergies you have");
			
			if (pollenAllergy) {
				System.out.println("Dont get close to tress");
			
		}else {
			System.out.println("Ok, I know you dont have amy pollen alleries");
			
		}
		}else{
			
			System.out.println("You are lucky not having any allergies");
		}
	

	}

}
