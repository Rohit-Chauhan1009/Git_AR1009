package com.greatlearing.corejava;

class Construct1{
	Construct1(){ // default constructor
		System.out.println("This is Rohit Chauhan");
	}
	Construct1(String Name, int age, float Height, float weight){
		System.out.println("The Name is "+ Name);
		System.out.println("The age is "+ age + " years.");
		System.out.println("The Height is "+ Height+ " cm.");
		System.out.println("The weight is "+ weight +" kg.");
		
	}
}


public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Construct1 Const = new Construct1();
		Construct1 Const1 = new Construct1("Rohit Chauhan", 27, 156.20f, 75f);
		
	}

}
