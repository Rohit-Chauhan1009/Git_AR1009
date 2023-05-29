package com.Greatlearning.corejava;

import java.util.ArrayList;
import java.util.List;
public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> List1 = new ArrayList<>();
		
		List<Integer> List2 = new ArrayList<>();
		
		System.out.println("List1 : "+ List1 + "\n List2 : "+List2 );
		
		List1.add(1);
		List1.add(2);
		
		System.out.println("List1 : "+ List1);
		
		List1.add(0, 5);
		
		System.out.println("List1 : "+ List1);
		
		List2.add(7);
		List2.add(5);
		
		List2.addAll(List1);
		System.out.println("List2 : "+ List2);
		
		List2.set(2, 101);
		System.out.println("List2 : "+ List2);
		
		List2.remove(1);
		System.out.println("List2 : "+ List2);
		
		System.out.println("Element at 3rd index : "+ List2.get(3));
		
	}

}
