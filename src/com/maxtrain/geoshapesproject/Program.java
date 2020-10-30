package com.maxtrain.geoshapesproject;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		var q1 = new Quad(3,4,5,6);
		//System.out.println("Perimeter is " + q1.perimeter());
		
		var r1 = new Rect(5,2);
		var str = String.format("Perimeter is %d and area is %d", r1.perimeter(), r1.area());
		//System.out.println(str);
		
		var s1 = new Sqr(5);
		var str1 = String.format("Square is %d and area is %d",  s1.perimeter(), s1.area());
		//System.out.println(str1);
		
		//make a generic collection
		var shapes = new ArrayList<Iperimeter>();
		shapes.add(q1);
		shapes.add(r1);
		shapes.add(s1);
		for(var shape : shapes) {
			System.out.println("Perimeter is " + shape.perimeter());
		}
	}

}
	