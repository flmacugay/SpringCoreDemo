package com.mac.model;

import java.util.List;

import com.mac.service.Shape;

public class Square implements Shape {
	
	private String type;
	private double height;
	private double width;
	
	List<Point> points;
	
	public Square(String type, double height, double width) {
		super();
		this.type = type;
		this.height = height;
		this.width = width;
	}

	public Square(String type) {
		super();
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	@Override
	public void draw() {
		System.out.println("Draw square");
		
		for (Point p : points) {
			System.out.println("Points "+p.getPointX()+" "+p.getPointY());
		}
	}

}
