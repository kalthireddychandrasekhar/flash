package com.chandu.springworkshop;

import java.util.Map;

//instantiation using factory-method and factory-bean
public class StudentClient {
	private int id;
	private String name;
	private Address address;

	
	/*using factory-method to create object*/ 
	private static StudentClient student = new StudentClient();
	public static StudentClient createInstance() {
		System.out.println("createInstance()-->using static method");
		return  student;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public static StudentClient getStudent() {
		return student;
	}
	public static void setStudent(StudentClient student) {
		StudentClient.student = student;
	}
	
	


	@Override
	public String toString() {
		return "StudentClient [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
