/**Write a Java program to find the factorial of 10.
 * 
 */

/**
 * @author rohit
 *
 */
import java.util.Scanner;
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter the no. ");
		int n = Sc.nextInt();
		int fac = 1;
		while(n>0) {
			fac = fac * n;
			n = n-1;
		}
		System.out.println("Factorial :" + fac);
	}

}
