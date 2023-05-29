package com.greatlearing.corejava;

public class ConstructorDemo1 {
	
	public ConstructorDemo1() {
		
		System.out.println("I am a Default Constructor");
	}
	
	public ConstructorDemo1(int x, float y, String Name, char C) {
	
		System.out.println("\n I am Parameterized constructor. "
				+ "I take various arguments as input.");
		System.out.println("The Square of x is: "+ x*x);
		System.out.println("The Square of x is: "+ y*y);
		System.out.println("The Name is: "+ Name);
		System.out.println("The Alphabete is: "+ C);
	}
	public void observation() {
		
		System.out.println("\n inside Observations method");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("\n Object Creation method1");
		
		ConstructorDemo1 obj = new ConstructorDemo1();
		ConstructorDemo1 obj1 = new ConstructorDemo1(5, 8.5f, "Rohit Chauhan", 'r');
		
		System.out.println("\n Object Creation method2");
		
		ConstructorDemo1 obj2, obj3;
		obj2 = new ConstructorDemo1();
		obj3 = new ConstructorDemo1(7, 9.9f, "Rohit", 'T');
		
		
		
	}

}
