package com.mac;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.model.Pentagon;

public class SpringAnnotationDemo {

	public static void main(String [] arg) {
		AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		applicationContext.registerShutdownHook();
		Pentagon pentagon=(Pentagon) applicationContext.getBean("pentagon");
		System.out.println("pentagon "+pentagon.getPointP().toString()+" "+pentagon.getPointP2().toString());
	}
	
}
