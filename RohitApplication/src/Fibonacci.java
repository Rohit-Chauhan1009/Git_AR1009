//Write a Java program to print the first 15 Fibonacci numbers ( the Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones Example 0,1,1,2,3,5,8,13,21,34)
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		int x = 0, y =1, z=0, n, term = 1;
		System.out.println("Enter the max value");
		n = Sc.nextInt();
		while(term <= n) {
			System.out.println(z);
			x = y;
			y = z;
			z = x + y;
			term = term +1;
		}
	}

}
