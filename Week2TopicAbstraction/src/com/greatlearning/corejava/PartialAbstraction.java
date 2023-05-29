package com.greatlearning.corejava;

class PartialAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj1 = new Dog();
		obj1.makesound();//here it should be Sound instead of makesound 
//		for partial it should be Sound i am getting an error after applying Sound.
		obj1.sleep();
	}

}
