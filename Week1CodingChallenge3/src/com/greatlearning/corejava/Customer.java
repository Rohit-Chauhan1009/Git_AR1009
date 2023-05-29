package com.greatlearning.corejava;
import java.util.Scanner;

public class Customer {
	public String Name = "Rohit Chauhan";
	private int id = 70232;
	protected float salary = 17420.56f;
	Scanner Sc = new Scanner(System.in);
	
//public void getdata() {
//	System.out.println("Enter the name :");
//	Name = Sc.next();
//	System.out.println("Enter the employee id:");
//	id = Sc.nextInt();
//	System.out.println("Enter the employee Salary");
//	salary = Sc.nextFloat();

//}
	
public void display() {
	System.out.println("The Employee id is " + id);
//	System.out.println("The Employee name is "+ Name);
//	System.out.println("The Employee salary is "+ salary);
	}
}