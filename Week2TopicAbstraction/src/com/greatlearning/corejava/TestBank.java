package com.greatlearning.corejava;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new SBI();
		int interest = b.getRateOfInterest();
		System.out.println("Rate of Interest is: "+ interest + "%");
		Bank P = new PNB();
		interest = P.getRateOfInterest();
		System.out.println("Rate of Interest is: "+ interest+ "%");
	}

}
