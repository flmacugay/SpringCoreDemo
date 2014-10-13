package com.mac;

import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.mac.model.Triangle;
import com.mac.service.Shape;

/**
 * BeanFactory demo
 * 
 * BeanFactory is deprecated, use DefaultListableBeanFactory
 * 
 * @author Froilan
 *
 */
@SuppressWarnings("deprecation")
public class SpringBeanFactory {

	public static void main(String[] args) {
		
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
		Shape squareShape=(Shape) beanFactory.getBean("square");
		squareShape.draw();
		Shape triangleShape= (Shape) beanFactory.getBean("triangle");
		triangleShape.draw();
		
		DefaultListableBeanFactory lbFactory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader bdReader=new XmlBeanDefinitionReader(lbFactory);
		bdReader.loadBeanDefinitions(new ClassPathResource("spring.xml"));
		Shape triangleShape2=lbFactory.getBean(Triangle.class);
		triangleShape2.draw();
		
	}

}
