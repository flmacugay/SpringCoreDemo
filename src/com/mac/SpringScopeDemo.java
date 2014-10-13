package com.mac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.model.Circle;

/**
 * 
 * spring bean scopes singleton and prototype applies only to the object's properties. Other objects within the class has their own scope.
 * 
 * @author Froilan
 *
 */
public class SpringScopeDemo {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		/* Singleton */
		
		Circle circle=(Circle) context.getBean("circle");
		System.out.println(circle.toString());
		circle.getPoint().setPointX(6);
		circle.getPoint().setPointY(6);
		circle.setRadius(11);
		Circle circle2=(Circle) context.getBean("circle");
		System.out.println(circle2.toString());
		
		
		/* Prototype */
		Circle circle3=(Circle) context.getBean("circle2");
		System.out.println(circle3.toString());
		circle3.getPoint().setPointX(7);
		circle3.getPoint().setPointY(7);
		circle3.setRadius(12);
		Circle circle4=(Circle) context.getBean("circle2");
		System.out.println(circle4.toString());
	}

}
