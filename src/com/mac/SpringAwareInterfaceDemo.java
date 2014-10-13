package com.mac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.model.Diamond;

public class SpringAwareInterfaceDemo {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Diamond diamond=(Diamond) context.getBean("diamond");
		
		String beanName=diamond.getBeanName();
		
		System.out.println("beanName="+beanName);
		System.out.println("from diamond context : "+ diamond.getContext().getStartupDate());
		System.out.println("from context : "+ context.getStartupDate());

	}

}
