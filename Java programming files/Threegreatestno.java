public class Threegreatestno {
    public static void main(String[] args) {
        int x = 14;
        int y = 18;
        int z = 13;
        
        if(x>y && x>z)
            System.out.println(x);
        else if (y>x && y > z) {    //here we can use to save the time (y>z) 
                                    //because we don;t need to check the y>x becuase of above condition.
            System.out.println(y);
        } 
        else {
            System.out.println(z);
        }
    }
}
