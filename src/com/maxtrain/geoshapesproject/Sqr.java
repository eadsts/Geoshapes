package com.maxtrain.geoshapesproject;

public class Sqr implements Iperimeter {
	private Rect rect;
	
	public int getSide() {
		return rect.getSide1();
	}
	public void setSide(int s) {
		rect.setSide1(s);
		rect.setSide2(s);
	}
	public int perimeter() {
		return rect.perimeter();
	}
	
	public int area() {
		return rect.area();
	}
	
	
	public Sqr(int s) {
		rect = new Rect(s, s);
	}
	public Sqr() {
		this(0);
	}
	
	
	
	

}
