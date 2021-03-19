package com.class16;

public class ReplaceAll {

	public static void main(String[] args) {
		
		String var="Syntax is best3434. Batch nine is great";
		System.out.println(var.replaceAll("[0-9]", ""));
		var="0481934937981634abcde";
		System.out.println(var.replaceAll("[a-z]", ""));
		var="981q327987KDJSKJDKSJDasdasdfa@#$%^&*";
        System.out.println(var.replaceAll("[a-z]", " "));

	}

}
