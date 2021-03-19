package com.class03;

import java.sql.SQLOutput;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Task3 {

	public static void main(String[] args) {
		
		int month=5;
		
		if (month==1) {
			System.out.println("This month is Janurary");
		}else if (month==2){
			System.out.println("This month is Febary");
		}else if(month==3){
			System.out.println("This month is March");	
		}else if(month==4) {
			System.out.println("This month is April");
		}else if(month==5) {
			System.out.println("This month is May");
		}else if(month==6) {
			System.out.println("This month is Jun");
		}else if (month==7) {
			System.out.println("This month is July");
		}else if(month==8) {
			System.out.println("this month is august");
		}else {
			System.out.println("This month is invaild");
		}
				
				

	}

}
