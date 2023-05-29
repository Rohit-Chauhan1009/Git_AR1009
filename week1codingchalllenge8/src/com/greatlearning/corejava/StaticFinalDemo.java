package com.greatlearning.corejava;

public class StaticFinalDemo {
	int var1 =10;
	static int var2 =10;
	
	public void method() {
		var1++;
		System.out.println(var1);
			
	}
	public void method2() {
		var2++;
		System.out.println(var2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//obj creating
		StaticFinalDemo obj = new StaticFinalDemo();
		StaticFinalDemo obj1 = new StaticFinalDemo();
		StaticFinalDemo obj2 = new StaticFinalDemo();
		
		System.out.println("\n using non-static keyword");
		obj.method();
		obj1.method();
		obj2.method();
		
		System.out.println("\n using static keyword");
		obj.method2();
		obj1.method2();
		obj2.method2();
	}

}
