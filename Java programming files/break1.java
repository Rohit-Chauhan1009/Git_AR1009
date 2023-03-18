public class break1 {
    public static void main(String[] args) {
        int i=1;
        int traget = 30;
        for(;;i++){
            System.out.println(2*i );
            if(i==20){
                continue;
            }
            else if(i== traget){
                
                break;
            }
            
        }
    }
}
