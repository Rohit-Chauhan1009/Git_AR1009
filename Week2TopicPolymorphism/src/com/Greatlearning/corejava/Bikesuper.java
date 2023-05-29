package com.Greatlearning.corejava;

class Bikesuper {
	int Speedlimit = 80;
	void run() {
		System.out.println("In super class");
	}
}

class HeroHonda extends Bikesuper{
	int Speedlimit = 160;
	void run() {
		System.out.println("In sub Class");
	}
}
