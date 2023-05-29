package com.greatlearning.corejava;

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n, fact = 0;
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the first NO.");
		n = Sc.nextInt();
		
		fact = factCal(n);
		System.out.println("fact ="+ fact);
	}
	static long factCal(long x) {
		long fact = 1;
		if(x==0)
			return fact;
		
		for(int i=1;i<=x;i++) {
			fact = fact * i;
		}
		return fact;
	}   

}
