package com.greatlearning.corejava;

class Student7{
	int rollno;
	String name;
	static String Institute = "IITR";
	//Static method to change the value of static variable
	static void change(){
	Institute = "IITB";
	}
	//Constructor to initialize the variable
	Student7(int r, String n)
	{
		rollno = r;
		name = n;
	}
	void display(){
	 	System.out.println(rollno+ " " +name+ " " + Institute);
	}

}
public class TestStaticMethod{
	public static void main(String args[]){
		Student7.change(); //calling change method
		//creating objects
		Student7 S1 = new Student7(101, "Virat");
		Student7 S2 = new Student7(102, "Mahi");
		Student7 S3 = new Student7(103, "sourav");
		//calling display method
		S1.display();
		S2.display();
		S3.display();
	}
}