package com.mac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.model.Square;
import com.mac.model.Triangle;

public class SpringDependencyInjectionDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		/* setter dependency injection*/
		Triangle triangle=context.getBean(Triangle.class);
		triangle.draw();
		System.out.println(triangle.getType());
		
		System.out.println(triangle.getPointA());
		System.out.println(triangle.getPointB());
		System.out.println(triangle.getPointC());
		
		
		/* constructor dependency injection */
		Square square=(Square) context.getBean("square");
		square.draw();
		System.out.println(square.getType());
		
		

	}

}
