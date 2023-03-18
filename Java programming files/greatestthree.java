public class greatestthree {
    public static void main(String[] args) {
        int x = 13, y = 11, z = 18, largest3num;
        
        largest3num = z>(x>y? x:y)? z:(x>y? x:y);
        System.out.println(largest3num);

    }
}
