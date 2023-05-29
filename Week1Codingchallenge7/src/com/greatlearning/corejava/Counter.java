package com.greatlearning.corejava;

public class Counter {
	// if we use Static keyword globally it will give output 123
//	static int count = 0; 
	// if we do not use Static keyword it will output 111
	int count =0;
	
	Counter(){
		count++;
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		Counter C1 = new Counter();
		Counter C2 = new Counter();
		Counter C3 = new Counter();
	}
}
