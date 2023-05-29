package com.greatlearing.corejava;

class perimeter{
	int length;
	int breadth;

	// Default Constructor
	perimeter()
	{
		
		length =0;
		breadth =0;
		
	}
	// parameterized Constructor
	perimeter(int l, int b){
		length = l;
		breadth = b;
	}
	void cal_perimeter(){
		int peri;
		peri = 2*(length + breadth);
		System.out.println(" " +peri);
	}
}
public class ConstantExample{
	public static void main(String args[]) {
	perimeter p1 = new perimeter(); //Invoke Default constructor;
	perimeter p2 = new perimeter(25, 100); // invoking perimeter constructor
	p1.cal_perimeter();
	p2.cal_perimeter();
	}
}