//Write a Java program to get a three-digit number as input from the user 
//and display the ones, tens and hundreds digit using loops and modulus operator.
import java.util.Scanner;
public class Threedigitno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Three digit no.");
		int x = Sc.nextInt();
		
		while(x>0) {
			int ones = x % 10;
			x = x/10; 
			System.out.println(ones);
			
		}
	}

}
