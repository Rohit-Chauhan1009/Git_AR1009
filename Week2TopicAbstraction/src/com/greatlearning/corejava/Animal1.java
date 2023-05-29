package com.greatlearning.corejava;

interface Animal1 {    //BOLD  (Syntax error on token "class", delete this token)

    public void makeSound(); // Syntax error on token "interface", delete this token

    public void Sleep();

}


class Dog1 implements Animal1{

    public void makeSound() {

             System.out.println("Dog Bark");
     }

    public void Sleep() {

            System.out.println("Sleep zzzzz");

      }

}
