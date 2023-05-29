package com.greatlearning.corejava;

abstract class Bank {
	abstract int getRateOfInterest();
}

class SBI extends Bank{
	int getRateOfInterest() {
		return 11;
	}
}

class PNB extends Bank{
	int getRateOfInterest() {
		return 12;
	}
}