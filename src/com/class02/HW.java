package com.class02;

public class HW {

	public static void main(String[] args) {
		

				byte package1=10; // Creating a Variable and assigning to it
				short package2=100;
				int package3=1000; // Creating a Variable and assigning to it
				long package4=10000;
				
				float F=12.54F;
			    double D=12.54;
			    
				char a='&';
				char b='$';
				
				boolean yes=true;
				boolean no=false;
						
				System.out.println(package1);
				System.out.println(package2);
				System.out.println(package3);
				System.out.println(F);
				System.out.println(D);
				System.out.println(a);
				System.out.println(b);
				System.out.println(yes);
				System.out.println(no);
				
				package2=200; // reassign the value (change the value of the variable)
				System.err.println(package2);
 
				// byte a=20; Java complains because now we have a duplicate variable 
				
				//package2=12.99; error: type mismatch: because variable package2 can only hold int type of values
				//package2=true; 
				
	}

}
