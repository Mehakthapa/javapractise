//package com.Demo;
//
//import static com.Demo.Stat.greet;
//
//public class Static {
//    public static void main(String[] args) {
//        Stat obj = new Stat(22,"RAKHI");
//        System.out.println(Stat.population);//use it instead of obj.population as it is better way- it will work beacuse static is refere to class
////        static variables are not dependent on objects
//
//        greet();//inside a static method if you are not creating object you cannot call it direcltly if the method is not static
////        Because something without static belongs to object
//
//        obj.fun();
//    }
//}
//class Stat{
//    int age;
//    String name;
//    static int population =4500000;//same for all
//
//    public Stat(int age, String name) {
//        this.age = age;
//        this.name = name;
//        this.population=population;//can be skipped
//    }
//
//    static void greet(){//not dependent on objects
//        System.out.println("hjk");
//    }
//
//    void fun(){
//        greet2();///can be put inside another method and make this func object
//    }
//    void greet2(){
//        greet();//we can have static method inside non-static method
//        System.out.println("good evening");
//    }
//}

