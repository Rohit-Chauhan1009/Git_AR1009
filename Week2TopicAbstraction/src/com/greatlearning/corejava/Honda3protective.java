package com.greatlearning.corejava;

public class Honda3protective extends BikeProtective{
	int Speedlimit = 150;
	public static void main(String[] args) {
		BikeProtective obj = new Honda3protective();
		System.out.println("The speed limit is :" + obj.Speedlimit + " Km/hr");
	}
}