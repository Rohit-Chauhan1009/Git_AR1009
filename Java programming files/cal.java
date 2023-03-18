import java.util.Scanner;
public class cal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter both number: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("please Check below option and enter the no.: ");
        System.out.println("1: Addition ");
        System.out.println("2: Subtraction ");
        System.out.println("3: Multiplication ");
        System.out.println("4: Division ");
        int opt = in.nextInt();

        switch(opt){
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if(b==0){
                    System.out.println("Cannot be divided");
                }
                else{
                    System.out.println(a / b);
                }
                break;
        }
    }
}
