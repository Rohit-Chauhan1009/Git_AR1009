package com.greatlearning.corejava;

public class Car {
	public void cartype() {
		System.out.println("Type:suv");
	}
}

class Swift extends Car{
	public void brand() {
		System.out.println("Brand:Maruti");
	}
	public void Speed() {
		System.out.println("Speed:140km/h");
	}
}

class i10 extends Swift{
	public void model() {
		System.out.println("model - i10");
	}
	public void speed1() {
		System.out.println("speed:160km/h");
	}
}