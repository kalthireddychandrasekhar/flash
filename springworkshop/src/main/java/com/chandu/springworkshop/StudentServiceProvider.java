package com.chandu.springworkshop;

public class StudentServiceProvider {
	
	private static StudentClient sc = new StudentClient();

	public StudentClient instanceCreation() {
		System.out.println("instanceCreation()-->non static method");
		return sc;
	}
}
