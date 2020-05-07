package com.chandu.springworkshop;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//implements InitializingBean,DisposableBean
public class Employee {

	/*
	 * public static Employee emp = new Employee();
	 * 
	 * public static Employee createInstance() { System.out.println(emp); return
	 * emp; }
	 */

	private int id;
	private String name;
	private Set<Department> department;
	private List<Address> address;
	private Map<String, String> map;

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

	/*
	 * public void destroy() throws Exception {
	 * System.out.println("destroy() called"); }
	 * 
	 * public void afterPropertiesSet() throws Exception {
	 * System.out.println("afterPropertiesSet() called"); }
	 */

	/* custom init() method & destroy() */
	public void init() {
		System.out.println("custom -->init()  method");
	}

	public void destroy() {
		System.out.println("custom-->destroy() method");
	}

}
