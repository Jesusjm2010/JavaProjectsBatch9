package com.class04;

public class NestedIfMoreExamples {

	public static void main(String[] args) {
		
		
		/*if it is Friday --> go to the movies, otherwise i will stay at home and study
		 * if it is Friday then I will check if day is the 13--> if yes-->watch scary movies
		 *                           if no--> I'll watch any movie you like
		 */
		
		boolean isFriday=true;
		int day=13;
		
		if(isFriday) {
			System.out.println("It is a movie day!!!");
			
			if(day==13) {
				System.out.println("I will watch a scary movie");
			}else {
				System.out.println("I'll watch any available movie");
			}
		}else {
			System.out.println("I will stay home and study Java");
		}
		System.out.println("---------------Example 2-----------------");

		/* check assignment and based on the score we'll display a message
		 */
		
		boolean completed=false;
		int score=88;
		
		if(completed) {
			if (score>90) {
				System.out.println("Great job");
			}else if (score>80) {
				System.out.println("good job");
			}else if (score>70) {
				System.out.println("Good but let's try to do better");
			}else {
				System.out.println("Good for tryinh, but study more!!!");
			}
			
		}else {
			System.out.println("Please make sure to complete all assigments on time");
		}
	}

}
