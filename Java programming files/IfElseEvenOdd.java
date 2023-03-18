import java.util.Scanner;
public class IfElseEvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Num you want to know Even or odd ");
        int num = in.nextInt();
        if (num % 2==0){
            System.out.println("The given no. is Even " + num);
        }
        else{
            System.out.println("The given no. is Odd "+ num);
        }
    }
}
