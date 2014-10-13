package com.mac.model;

public class Point {
	
	private double pointX;
	private double pointY;
	
	public double getPointX() {
		return pointX;
	}
	public void setPointX(double pointX) {
		this.pointX = pointX;
	}
	public double getPointY() {
		return pointY;
	}
	public void setPointY(double pointY) {
		this.pointY = pointY;
	}
	@Override
	public String toString() {
		return "Point [pointX=" + pointX + ", pointY=" + pointY + "]";
	}
}
