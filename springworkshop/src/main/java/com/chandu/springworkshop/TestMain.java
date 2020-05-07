package com.chandu.springworkshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		//BeanFactory context = new XmlBeanFactory(new ClassPathResource("cofiguration.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("employee-configuration.xml");
		Employee emp = context.getBean("employee",Employee.class);
		System.out.println(emp);
		
		
	}

}
