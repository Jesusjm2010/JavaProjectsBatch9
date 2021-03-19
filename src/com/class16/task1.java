package com.class16;

public class task1 {

	public static void main(String[] args) {
		/*
		 * Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		 * Create a String that should be combination of letters, numbers and special characters. 
		 * Find out how many alpha characters are there in the String.
		 * You have a String a="Is it Saturday? Is it raining? 
		 * Do we have a Java Class today?" How would you find out how many sentences are in that String
		 */
		
		String var1="I love playing soccer";
		var1=var1.replaceAll(" ", "");
		System.out.println(var1);
		
		System.out.println("------------task 2----------------");
		
		String var2="My Phone # is 571-343-3423*";
		String word=var2.replaceAll("^a-zA-Z", "").replaceAll(" ", "");
		System.out.println(word.length());
		
		System.out.println("------task 3---------------");
		
		String a="It us Saturday? Is it raining? Do we have Java class today?";
		
		
		System.out.println(a.split("[?]").length);
		

	}

}
