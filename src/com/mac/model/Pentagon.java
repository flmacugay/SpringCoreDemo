package com.mac.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.mac.service.Shape;

public class Pentagon implements Shape {
	
	@Autowired
	private Point pointP;
	
	@Resource
	private Point pointP2;
	
	public Point getPointP() {
		return pointP;
	}
	public void setPointP(Point pointP) {
		this.pointP = pointP;
	}
	public Point getPointP2() {
		return pointP2;
	}
	public void setPointP2(Point pointP2) {
		this.pointP2 = pointP2;
	}

	@Override
	public void draw() {
		System.out.println();
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("at pentagon post construct");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("at pentagon pre destroy");
	}
}
