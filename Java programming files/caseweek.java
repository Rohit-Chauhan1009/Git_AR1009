import java.util.Scanner;
public class caseweek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the no. : ");
        int days = in.nextInt();
        
        switch(days){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday"); 
                break;    
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Enter the valid no.");
        }
    }
}
