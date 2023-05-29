class Student{

    Student(){

        this(1); //this(1) will call the parameterized constructor

        System.out.print(" hello");

    }

    Student(int x){

        System.out.print("hi");

    }

}

 

class Main1 {

    public static void main(String args[]) {

        Student Stud = new Student();

    }

}

