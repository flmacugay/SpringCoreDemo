package com.mac.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.mac.service.Shape;

public class Diamond implements Shape, ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean {
	
	private ApplicationContext context;
	private String beanName;
	

	public ApplicationContext getContext() {
		return context;
	}

	public String getBeanName() {
		return beanName;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Inside diamond bean name aware.");
		this.beanName=beanName;
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		System.out.println("Inside diamond application context aware.");
		this.context=context;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean implementation of "+beanName);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean implementation of "+beanName);
		
	}
	
	public void setup() {
		System.out.println("Init method of "+beanName);
	}
	
	public void cleanup() {
		System.out.println("Destroy method of "+beanName);
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("at diamond post construct");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("at diamond pre destroy");
	}

}
