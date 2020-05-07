package com.chandu.springworkshopannotations;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	/*public static Employee emp = new Employee();
	
	public static Employee createInstance() {
		System.out.println(emp);
		return emp;
	}*/
	
	private int id;
	private String name;
	private Set<Department> department;
	private List<Address> address;
	private Map<String,String> map;
	
	public void init() {
		System.out.println("init method initialized");
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

	public Set<Department> getDepartment() {
		return department;
	}

	public void setDepartment(Set<Department> department) {
		this.department = department;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	
	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", address=" + address
				+ ", map=" + map + "]";
	}

	
	
	

}
