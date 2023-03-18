import java.util.Scanner;
public class IfElseDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter your Fucking age: ");
        int age = in.nextInt();
        if(age>=60)
            System.out.println("too aged");
        else if(age>=18){
            System.out.println("You can drive the car because you are above "+ age);

        }
        else{
            System.out.println("You can not drive the car becuase your age is " + age + " less than 18");
        }

        
    }
}
 