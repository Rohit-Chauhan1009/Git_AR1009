public class Ternary{
    public static void main(String[] args) {
        int x = 10, y = 12, res;
        System.out.println("First num :" + x);
        System.out.println("Second num :" + y);

        res = (x > y) ? (x + y): (x-y);
        System.out.println("The result is :" + res); 
    }
}