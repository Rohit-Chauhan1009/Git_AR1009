package com.greatlearning.corejava;

class Base{
	public void Method1() {
		System.out.println("Base Class Method ");
	}
}

class Child extends Base{
	public void Method() {
		System.out.println("Child Class Method");
		
	}
}


public class InheritanceMain {
	public static void main(String[] args) {
		Child c = new Child();
		c.Method1();
		c.Method();
	}
}
