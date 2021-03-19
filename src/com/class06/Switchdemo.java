package com.class06;

public class Switchdemo {

	public static void main(String[] args) {
	
		int day = 40;
		String weekDay;

		if (day == 1) {// works with conditions, it 
			weekDay="Monday";

		} else if (day == 2) {
			weekDay="Tuesday";

		} else if (day == 3) {
			weekDay="wendesay";

		} else if (day == 4) {
			weekDay="Thursday";
			
		} else if (day == 5) {
			weekDay="friday";
			
		} else if (day == 6) {
			weekDay="Saturday";
			
		} else if (day == 7) {
			weekDay="Sunday";
			
		} else {
			weekDay="Invalid";
		}
		if (!weekDay.equals("Invalid")) {
			System.out.println("Today is "+weekDay);
		}

		System.out.println("-------using switch---------");
		
		String weekDay1;
		
		switch(day) {//is a value based
		
		//we CANNOT have duplicate cases
		// values Must match a variable type
		// we Must have break in every case
		   
		case 1:
			weekDay1="Monday";
			break;
		case 2:
			weekDay1="Tuesday";
		case 3:// it jumps right away to the matching case
			weekDay1="Wednesday";
			break;
		case 4:
			weekDay1="Thursday";
			break;
		case 5:
			weekDay1="Friday";
			break;
		case 6:
			weekDay1="Saturday";
			break;
		case 7: 
			weekDay1="Sunday";
			break;
		default: 
			weekDay1="Invalid";
		}
		
			if (!weekDay.equals("Invalid")) {
				System.out.println("Today is "+weekDay);
		
		}
	}

}
