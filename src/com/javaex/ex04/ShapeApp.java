package com.javaex.ex04;
import java.util.*;

public class ShapeApp {
	public static void main(String[] args) {
		Rectangle r01 = new Rectangle(5, 6);
		RightTriangle t01 = new RightTriangle(6,2);
		
		ArrayList<Shape> sArray = new ArrayList<>();
		sArray.add(r01);
		sArray.add(t01);
		
		for(int i=0; i<sArray.size(); i++) {
			System.out.println("Area: " + sArray.get(i).getArea());
			System.out.println("Perimeter: " + sArray.get(i).getPerimeter());
			
			if(sArray.get(i) instanceof Resizeable) {
				((Resizeable)sArray.get(i)).resize(0.5);
				System.out.println("New Area: " + sArray.get(i).getArea());
				System.out.println("New Perimeter: " + sArray.get(i).getPerimeter());
			}
		}
		
	}
}
