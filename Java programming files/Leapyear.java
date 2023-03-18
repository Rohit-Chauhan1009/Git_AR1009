import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Plese enter the year: ");
        int year = in.nextInt();

        if(year % 400 == 0){
            System.out.println("This is leap year: " + year);
        }
        else if(year % 100 ==0){
            System.out.println("The given year is not leap year " + year);
        }     
        else if(year % 4 ==0){
            System.out.println("The given year is not leap year " + year);
        } 
        else{
            System.out.println("The give year is not leap year "+ year);
        }
    }
}
