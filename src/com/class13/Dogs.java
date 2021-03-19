package com.class13;

public class Dogs {
	
	public String breed;
	public String size;
	public String color;
	public String age;
	public void bark(){
        System.out.println("ruff ruff ruff and wow wow wow");
	}
	
	public void sleep() {
		System.out.println("ZZZZzzzzzz");
	}
	
	public void eat() {
		System.out.println("Omnomnon");
	}
	public void look() {
		System.out.println("Hi I Am a dog my color is "+color);
	}
	public static void main(String[] args) {
		
		
		Dogs A= new Dogs();
		
		A.breed="Bulldog";
		A.size="large";
		A.color="light gray";
		A.age="6 years";
		A.bark();
		A.eat();
		A.sleep();
		A.look();
		
        Dogs B= new Dogs();
		
		B.breed="Beagle";
		B.size="large";
		B.color="Orange";
		B.age="6 years";
		
        Dogs C= new Dogs();
		
		C.breed="German Shepherd";
		C.size="large";
		C.color="White & Orange";
		C.age="6 years";
	}
}
