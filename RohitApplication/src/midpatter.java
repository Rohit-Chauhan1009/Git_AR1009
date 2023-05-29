import java.util.Scanner;

//System.out.print("* ");
public class midpatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the no. of pattern you want");
		int n = Sc.nextInt();
		for(int i =0; i<n; i++) {
			 for (int j=n-i; j>1; j--)
	            {
	                // printing spaces
	                System.out.print(" ");
	            }
	  
	            //  inner loop to handle number of columns
	            //  values changing acc. to outer loop
	            for (int j=0; j<=i; j++ )
	            {
	                // printing stars
	                System.out.print("* ");
	            }
			System.out.println();
		}
	}

}
