package com.chandu.springworkshop;
//instantiation using factory-method and factory-bean
public class Student {
	
	private static StudentClient student = new StudentClient();
	
	public static StudentClient createInstance() {
		System.out.println("createInstance-->using static method");
		return  student;
		
	}
	
	public StudentClient objInstance() {
	System.out.println("objInstance()--> using non static method ");	
		return student;
	}

}
