package com.Demo;
//
//public class Contructor {
//
//    public static void main(String[] args) {
//        Child obj =new Child();
//    }
//}
//class Base{
//
//    public Base(){
//        System.out.println("fghjkl;");
//    }
//    public Base(int a){
//        System.out.println("value"+ a);
//    }
//}
//class Child extends Base{
//    public Child(){
//        super(8);
//        System.out.println("child;");
//    }
//
//}

public class Contructor {
    public static void main(String[] args) {
//        Const obj = new Const("mehak" , 22);
//        obj.age=4;
//        System.out.println(obj.age);


//        final ------------------------
        Const obj2 = new Const("mehk");
        System.out.println(obj2.namee);
        obj2.namee="hjkk";
        System.out.println(obj2.namee);
        obj2=new Const("hjkl");//but with final we cannot do it
        System.out.println(obj2.namee);
        System.out.println(obj2);

//        ---------------------------------
    }

}
class Const{
    String name;
    int age;
//    final keyword ----------------------
    final String  BONUS="sdfg";
    String namee;

    Const(String myname){
        this.namee = myname;

    }
//----------
// -----------------------------------



    Const( String name, int age  ){
        this.name = name;
        this.age = age;
    }
    Const(Const  other ){
        this.name  = other.name ;
    }
}