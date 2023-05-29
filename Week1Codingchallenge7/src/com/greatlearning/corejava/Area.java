package com.greatlearning.corejava;
//Write an algorithm to create class Area and find area of the circle using final keyword for pi value.
public class Area {
	final float pi = 22 / 7;
	public float radius, result;

	public static void main(String[] args) {
		Area area = new Area();
		area.radius = 12.2f;
		area.result = area.pi * area.radius * area.radius;
		System.out.println("The are of the circle is: " + area.result + " cm");
	}
}
