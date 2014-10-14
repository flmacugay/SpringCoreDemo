package com.mac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.event.MyEventPublisher;

public class SpringEventHandlingDemo {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		MyEventPublisher publisher=context.getBean(MyEventPublisher.class);
		publisher.publishCustomEvent();
	}

}
