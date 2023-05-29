package com.greatlearning.corejava;

interface InterfacePrintable {
	void print();
}

class A6 implements InterfacePrintable{
	public void print() {
		System.out.println("Learning OOP from Great Learning");
	}
}