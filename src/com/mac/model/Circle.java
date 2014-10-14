package com.mac.model;

import org.springframework.beans.factory.annotation.Qualifier;

import com.mac.service.Shape;

public class Circle implements Shape {

	private Point point;
	private double radius;
	
	public Point getPoint() {
		return point;
	}
	@Qualifier("pointE")
	public void setPoint(Point point) {
		this.point = point;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		
	}
	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + "]";
	}
	
}
