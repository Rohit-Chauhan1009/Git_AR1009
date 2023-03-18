import java.util.Scanner;
class Calculator{
    int a;
    public int add(int n1, int n2){
        System.out.println("in add");
        int r = n1+n2;
        return r;
    }

}
public class cal{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two no.: ");
        int A = in.nextInt();
        int b = in.nextInt();

        Calculator calc = new Calculator();
        int result = calc.add(A, b);

        System.out.println("The sum of Two no. is : " + result);
    }
}
