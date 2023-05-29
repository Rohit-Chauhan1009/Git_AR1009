package com.greatlearning.corejava;

abstract class BikeABs {
	BikeABs(){
		System.out.println("Bike is Created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("Gear Changed");
	}
}

class HondaAbs extends BikeABs{
	void run() {
		System.out.println("running safely");
	}
}