package com.class15;

public class studentTester {

	public static void main(String[] args) {
		
		RecapStudent ramobj=new RecapStudent(); // Creating an object
		
		ramobj.name="Ram";
		ramobj.age=25;
		ramobj.StudentId="CS123";
		ramobj.schoolName="Syntax";
		ramobj.study();
		ramobj.payTuition();
		
		RecapStudent aimenObj=new RecapStudent();
		aimenObj.name="Aimen";
		aimenObj.age=26;
		aimenObj.StudentId="CS5456";
		aimenObj.schoolName="Syntax";
		aimenObj.study();
		aimenObj.payTuition();

	}

}
