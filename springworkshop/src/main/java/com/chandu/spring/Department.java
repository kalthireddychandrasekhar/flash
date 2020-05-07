package com.chandu.spring;

import org.springframework.stereotype.Component;

@Component
public class Department {
	private int deptId;
	private String deptName;
	
	
	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}


	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	

}
