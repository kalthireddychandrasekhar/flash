package com.chandu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String[] args) {
		//BeanFactory context = new XmlBeanFactory(new ClassPathResource("cofiguration.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("emp-configuration.xml");
		System.out.println("beanfactory is initialized");
		Employee employee = context.getBean("employee",Employee.class);
		System.out.println(employee);

		
		
	}

}
