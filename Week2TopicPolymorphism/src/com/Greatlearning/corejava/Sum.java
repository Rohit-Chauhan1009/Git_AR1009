package com.Greatlearning.corejava;
// java program to demonstrate working of Method Overloading
public class Sum {
	// Overloaded Sum(). This sum takes two int
	public int sum(int x, int y)
	{
		return (x+y);
	}
	// overloaded sum().this sum takes Three int 
	public int sum(int x, int y, int z) 
	{
		return (x + y + z);
	}
	// overloaded sum(). This sum takes two double
	public double sum(double x, double y)
	{
		return (x + y);
	}
	// Drive code
	public static void main(String[] args) {
		Sum s = new Sum();
		System.out.println(s.sum(10, 20));
		System.out.println(s.sum(10, 20, 30));
		System.out.println(s.sum(10.5, 20.5));
	}
}

