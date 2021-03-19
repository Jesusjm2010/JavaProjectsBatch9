package com.class02;

public class NamingConvention {

	public static void main(String[] args) {
		
		//Keywords - a special word that reserved in java memory; class,public, static,final for
		
		//Identifiers - name that we give to classes, variable and methods
		
		/*
		 * Rule !!
		 * DO NOT USE KEYWORDS AS IDENTIFIERS
		 * IDEMTODOERS CANNOT CONTAIN SPACE
		 * IDENTIFIERS CANNOT START WITH A NUMBER
		 * IDENTIDIERS CANNOT HAVE SPECIAL CHARACTERS:_ OR $
		 */
		
		//1. int final=10; error: INVALD INFETIFIER
		
		//2. byte variable one=12:
		
		//3. Short 1b=12;
		     Short b1=12;
		     
	    //4 Long *l=2000;
		     //long l*=2000;
		     
		     long _l=2000;
		     long long_=29990;
		     
		     double $price=12.99;
		     double prince$=10.99;
		     
		     //NamingConvention 
		       // 1. we use camel casing
		       // 2. classes start with Upper cases and will follow camel casing 
		       // 3. variable start with lower case and will follow camel casing
		       // 4. package we use lower case and use name as reverse way URL
		       // 5. use meaningful name for your variables
		     
		     int Number=12; // try not to use upper case names
		     int number=12; // more preferable 
		     
		     int numerOne=12;
		     int numberTwo=13;
		     
		     boolean isSnow=true;
		     boolean snow=true;
		     
		     double applePrice=12.99;
		     double mangoPrice=13.89;
		     
		     String fullName;
		     
		     fullName="John Doe";
		     
		     
		     System.out.println("Hello, I am "+fullName);
		     
		     
		     

	}

}
