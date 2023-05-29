//Write a Java program to print the below pattern
import java.util.Scanner;
public class RevPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the no. of pattern you want");
		int n = Sc.nextInt();
		for(; n>=1; n--) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
