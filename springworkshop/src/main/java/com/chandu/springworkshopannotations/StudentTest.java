package com.chandu.springworkshopannotations;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class StudentTest {
public static void main(String[] args) {
	BeanFactory factory =  new XmlBeanFactory(new ClassPathResource("student-configuration.xml"));
	System.out.println("Bean Factory is initialized");
	StudentClient s1 = (StudentClient) factory.getBean("studentClient");
	StudentClient s2 = (StudentClient) factory.getBean("sc");
	
	StudentClient std = factory.getBean("std", StudentClient.class);
	System.out.println(std);
	
	
}
}
