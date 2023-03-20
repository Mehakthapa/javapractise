package com.Demo;

public class Dynamicdispatch {
    public static void main(String[] args) {

        Phone obj =new SmartPhone();//super class reference can be equal to subclass objects but not vice versa i.e subclass reference cannot be
        obj.name();//the object will run not the reference
//        In the below code, we've created two classes: Phone & SmartPhone.
//        The Phone is the parent class and the SmartPhone is the child class.
//        The method name() of the parent class is overridden inside the child class.
//        Inside the main() method, we've created an object obj of the Smartphone() class by taking the reference of the Phone() class.
//        When obj.name() will be executed, it will call the on() method of the SmartPhone() class because the reference variable obj is pointing towards the object of class SmartPhone().
//obj.show();//if we try to get the method which is not present in parent class and present in child class then it will not run
        obj.music();//

    }
}
class Phone{
    public void name(){
        System.out.println("phone");
    }
    public void music(){
        System.out.println("play music");
    }
}
class SmartPhone extends Phone{
    public void name(){
        System.out.println("smartphone");
    }
    public void show(){
        System.out.println("show smartphone");
    }
}
//method hai jo run hona hai vo run time pe run hota h and object bhhi runtime pe create hota hai
