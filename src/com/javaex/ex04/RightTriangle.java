package com.javaex.ex04;

public class RightTriangle extends Shape{
	private double width;
	private double height;
	
	public RightTriangle() {
		super(3);
	}
	public RightTriangle(double width, double height) {
		this();
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double getArea() {
		double area = width * height * 0.5;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = width + height + Math.pow(Math.pow(width, 2) + Math.pow(height, 2), 0.5);
		return perimeter;
	}
}
