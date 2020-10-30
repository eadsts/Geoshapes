package com.maxtrain.geoshapesproject;

public class Rect implements Iperimeter {
	//create an instance in our new class of the class we are going to use for composition
	//Quad is the class name and quad is a variable (could be fred)
	//properties from Quad
	//quad is null until we initialize it with an instance of Quad
	//see below where we say quad = new Quad(s1, s2, s3, s4);
	private Quad quad;
	
	//get side 1 and side 2 from Quad
	public int getSide1() {
		return quad.getSide1();
	}
	public int getSide2() {
		return quad.getSide2();
	}
	//set side 1 and side 2 from Quad - side 3 and side 4 are transposed to side 3 and side 4
	public void setSide1(int s1) {
		quad.setSide1(s1);
		quad.setSide3(s1);
	}
	public void setSide2(int s2) {
		quad.setSide2(s2);
		quad.setSide4(s2);
	}
	
	public int area() {
		return quad.getSide1() * quad.getSide2();
	}
	
	//use quad in composition to call perimeter
	public int perimeter() {
		return quad.perimeter();
	}
	
	//constructor with parameters - rectangles only have two sides
	//need to assign a value to quad property or it will be null
	//set value by creating an instance
	public Rect(int s1, int s2) {
		quad = new Quad(s1, s2, s1, s2);
	}
	
	//default constructor - if Quad calls Rect here, need to have this constructor call the other 
	//constructor in Rect
	public Rect() {
		this(0,0);
	}
}
