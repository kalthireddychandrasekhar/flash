package com.chandu.springworkshopannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String[] args) {
		//BeanFactory context = new XmlBeanFactory(new ClassPathResource("cofiguration.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("emp-configuration.xml");
		System.out.println("beanfactory is initialized");
		/*scopes: if scope is singleton/prototype */
		Employee employee = context.getBean("employee",Employee.class);
		Employee employee1 = context.getBean("employee",Employee.class);

		//Employee emp = (Employee) context.getBean("emp");
		System.out.println(employee);
		System.out.println(employee == employee1);
		
		
	}

}
