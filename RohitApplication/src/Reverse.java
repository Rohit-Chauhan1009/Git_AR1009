// Write a Java program to reverse a three-digit number using loops.

import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int x = Sc.nextInt();
		int y =0;
		while (x>0) {
			y = (y*10)+ x%10;
			x = x/10;
		}
		System.out.println(y);
	}

}
