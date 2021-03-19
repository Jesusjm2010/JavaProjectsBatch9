package com.class10;

import java.sql.SQLOutput;

public class Task2 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of names and store all names of your group. 
		 * Then print your name from that array. (use 2 different ways of creating an array).
		 * 
		 * Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: “Saturday is Java coding Day”.
		 * 
		 */
		
		String[] name=new String[7];
		 name[0]="Maria";
		 name[1]="Chris";
		 name[2]="Edwin";
		 name[3]="Jesus";
		 name[4]="Brain";
		 name[5]="Kisanet";
		 name[6]="Emma";
		 
		 System.out.println(name[3]);
		
		String[] names= {"Maria","Chris","Edwin","Emma","Brian","Kisanet","Melaku","Jesus"};
		
		System.out.println(names[7]);
		
		String[] words=new String[5];
		 words[0]="Java";
		 words[1]="Saturday";
		 words[2]="day";
		 words[3]="coding";
		 words[4]="is";
		 
		 System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		 
		 String[] word= {"Java", "Saturday","day","coding","is"};
		 
		 System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		 
		 for(int i=0; i<=name.length; i++) {
			 System.out.println(name[i]);
		 }

	}

}
