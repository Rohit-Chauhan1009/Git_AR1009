import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for loop: ");
        int i = in.nextInt();
        int a = in.nextInt();
        System.out.println("Enter the no. you want: ");
        int h = in.nextInt();
        while(i<=a)
        {
            System.out.println("HI "+ i);
            int j = 1;
            while(j<=h){
                System.out.println("Welcome to java coding: "+ j);
                j++;
            }
            i++;
        }
        
        System.out.println("Bye " + i);   
    }
}
