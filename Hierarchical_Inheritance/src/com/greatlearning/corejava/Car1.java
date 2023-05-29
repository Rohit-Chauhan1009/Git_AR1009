package com.greatlearning.corejava;

public class Car1 {
	public void VehicleType() {
		System.out.println("Type:2seater");
	}
}

class ford extends Car1{
	public void model() {
		System.out.println("Type: ford Equator SUV ");
	}
	public void Carspeed() {
		System.out.println("Speed: 230KM/hr");
	}
}

class Mahindra extends Car1{
	public void model() {
		System.out.println("Type: mahindra Thar ");
	}
	public void Carspeed() {
		System.out.println("Speed: 180KM/hr");
	}
}