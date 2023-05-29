package com.greatlearing.corejava;

public class ThreeDimensionShape {
	
	double width, height, depth;
	// Construction is used when width, height and depth are specified
	public ThreeDimensionShape(double w, double h, double d) {
		// TODO Auto-generated constructor stub
		width = w;
		height = h;
		depth = d;
	}
	//constructor is used when no dimension is specified.
	public ThreeDimensionShape() {
		// TODO Auto-generated constructor stub
		width = height = depth = 0;
	}
	//Constructor is used when only lenght is specified ie. Case of cube 
	 public ThreeDimensionShape(double l) {
		 
		 width = height = depth = l; 
		 
	 }
	 //method of case when calculate the volume
	 double volume() {
	
		 return width*height*depth;
	 }
	
}
