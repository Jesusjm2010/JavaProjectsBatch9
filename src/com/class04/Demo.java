package com.class04;

import java.util.Scanner;

//shortcut to import for windows:ctrl+shift+o
public class Demo {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter any text");
		
		String text=scan.nextLine();//scan.nectline();-->capture your input from console
		                            // once you enter a text you must HIT ENTER
		
		System.out.println("text that I entered is - "+text);
		
		System.out.println("please enter your name");
		
		String name=scan.next();//capture one word till space
		
		System.out.println("Nice to meet you");

		System.out.println("Please enter you age");
		
		int age=scan.nextInt();
		
		System.out.println("My name is "+name+" and I am "+age+" years old");
	}

}
