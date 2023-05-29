package com.Greatlearning.corejava;

class vehiclepoly{
	void run() {
		System.out.println("Vehicle is running");
	}
}

public class Bike4 extends vehiclepoly {
	void run() {
		System.out.println("Bike is running");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike4 obj = new Bike4();
		obj.run();
	}

}
