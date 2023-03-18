package input;
import java.util.Scanner;
public class ouput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter you no.");
        double num = in.nextDouble();
        double num2 = in.nextDouble();

        double sum = num + num2;
        System.out.println(sum);
        System.out.println("please Enter you name: ");
        String Name = in.next();
        System.out.println("your name is : "+ Name);
        System.out.println("please Enter Boolean: ");
        Boolean bool = in.nextBoolean();
        System.out.println("The identity is: "+ bool);
        System.out.println("please Enter the Statment: ");
        String str = in.nextLine();
        System.out.println("yes it is : "+ str);  
         
    }
    
}
