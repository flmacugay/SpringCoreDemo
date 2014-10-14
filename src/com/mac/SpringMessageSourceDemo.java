package com.mac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.service.MyMessageSource;

public class SpringMessageSourceDemo {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		MyMessageSource mSource=context.getBean(MyMessageSource.class);
		mSource.displayMessage();
	}

}
