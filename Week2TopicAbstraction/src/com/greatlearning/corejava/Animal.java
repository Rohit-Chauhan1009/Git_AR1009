package com.greatlearning.corejava;

abstract class Animal {
	public abstract void makesound();
	
	public void sleep() {
		System.out.println("Sleep to zzzz");
	}
	
}

class Dog extends Animal{
	public void makesound(){
		System.out.println("Bark");
	}
	
}
