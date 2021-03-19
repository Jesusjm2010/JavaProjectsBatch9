package com.class06;

public class SwitchExamples {

	public static void main(String[] args) {
		
      /*
       *store gender using M or F 
       * base on the gender we will specify
       * if M-->Male
       * if F-->Female
       * otherwise--> not sure
       */
		
		char gender='F';
		String description;
		
		switch (gender) {
		
		case 'M':
			description="Male";
			break;
			
		case 'F':
			description="Female";
			break;
			
			default:
				description="N/A";
		
		}

		System.out.println(description);
		
		/*
		 * LIMITATION
		 * switch CANNOT use Relational or Logical Operator(it simply check values)
		 * switch CANNOT be use with boolean,float, double, long
		 * switch only works with byte,short,char, int & String
		 */
		
		boolean sunny=true;
		
		if (sunny) {
			System.out.println("I'm Happy");
		}
		
		double price=10.99;
		
		if(price>10) {
			System.out.println("Too expensive");
		}
		
	}
 
	

}
