package com.Demo;

public class Classesandobjects {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee maria = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object
        maria.id = 12;
        maria.name = "Maria jeo";
    }

}
class  Employee{
    int id;
    String name;

    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);


    }

}