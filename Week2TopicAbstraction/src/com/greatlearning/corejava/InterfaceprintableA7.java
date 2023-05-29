package com.greatlearning.corejava;

interface InterfaceprintableA7 {
	void printA7();
}

interface InterfaceshowableA7{
	void ShowA7();
	
} 	
class A8 implements InterfaceprintableA7, InterfaceshowableA7{
	public void printA7() 
	{
		System.out.println("Welcome to Oops learning");
	}
	public void ShowA7() 
	{
		System.out.println("hello From Great learning");
	}
}