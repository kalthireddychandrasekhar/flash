package com.chandu.springworkshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LookuptTest {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("lookup.xml");
	MySingleton  ms = (MySingleton) context.getBean("singleton");
	ms.m1();
	System.out.println("==================");
	ms.m1();
	
	BeaninheritanceEx1 bean = (BeaninheritanceEx1) context.getBean("inherit");
	System.out.println(bean.getId());
	System.out.println(bean.getName());
	System.out.println(bean.getMsg());

	

	


	
}
}
