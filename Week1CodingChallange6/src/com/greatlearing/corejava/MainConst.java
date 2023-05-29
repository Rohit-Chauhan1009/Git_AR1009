package com.greatlearing.corejava;

// Drive code

public class MainConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create boxes using various Constructor
		ThreeDimensionShape Shape1 = new ThreeDimensionShape(7, 8, 9);
		ThreeDimensionShape Shape2 = new ThreeDimensionShape();
		ThreeDimensionShape Shape3 = new ThreeDimensionShape(5);
		
		double volume;
		
		//Get volume of First box
		volume = Shape1.volume();
		System.out.println("volume of the Shape1 is :" +volume);
		
		//Get volume of second box
		volume = Shape2.volume();
		System.out.println("volume of the Shape2 is : "+ volume);
		
		//Get volume of the cube (3rd box)
		volume = Shape3.volume();
		System.out.println("Volume of cube is :" +volume);
		
		
	}

}
