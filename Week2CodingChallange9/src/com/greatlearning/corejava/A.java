package com.greatlearning.corejava;

public class A {
	int a, b;
	public void display() {
		System.out.println("Using display Method " + a +", "+ b);
	}

}

class B extends A{
	int c;
	public void Show() {
		System.out.println("Using show method "+a+", "+ b+", "+c);
	}
}