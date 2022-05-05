package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
	private double width;
	private double height;
	
	public Rectangle() {
		super(4);
	}
	public Rectangle(double width, double height) {
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
		double area = width * height;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 2 * width + 2 * height;
		return perimeter;
	}
	
	public void resize(double s) {
		width *= s;
		height *= s;
	}
}
