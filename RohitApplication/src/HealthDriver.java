class Health{
	protected int age =27 ;
	protected float weight = 68.56f;
	protected float height = 156.2f;

public void display(){
	System.out.println("Age is " + age + " years.");
	System.out.println("The Weight is " +weight +" kg.");
	System.out.println("The Height is " + height +" cm. ");
	}
}
public class HealthDriver{
	public static void main(String[] args) {
		Health H = new Health();
		H.display();
	}
}


//com.greatlearning.corejavac.Create classesHealthandHealthDriverin the samepackaged.
//Create an int variableageand float variablesweightandheightin class Health.e.
//Assign values to these variables.f.Useprotectedaccess modifier for all the variables.g.
//Create main method inHealthDriverclassh.
//Create an object of classHealthin classHealthDriver.i.Print associated values with the help of Healthclassobject.j.
//Stoppackage

//com.greatlearning.corejava;
//public class Health{
//	protected int age = 25;
//	protected float height = 182.5f;
//	protected float weight = 78.6f;
//}
//--------------------------------------------------------------------------------------
//package com.greatlearning.corejava;
//public class HealthDriver {
	///public static void main(String[] args) {
//		Health health =new Health ();
//		System.out.println("Age is: "+health.age+" years");
//		System.out.println("Height is: "+health.height+"cm");
//		System.out.println("Weight is: "+health.weight +"kg");
		//}///