public class Main2 {

    final float pi = 7 / 22;

    float radius = 5, area = 0;

 

public void calculateArea(){

    pi = 22/7;

    area = pi * radius * radius;

    System.out.println(" Area of circle is: " + area);

}

 

    public static void main(String[] args) {

        Main2 obj = new Main2();

        obj.calculateArea();

    }

}