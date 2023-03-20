package com.Demo;
/////----interface with default method ------------------------------------------------------------------
//public class InterfaceEg {
//    public static void main(String[] args) {
//        AndroidPhone obj = new AndroidPhone();//we can use all methods
//        obj.clickpicture();
//        obj.greet();
//    }
//}
//
//interface Camera{
//    void clickpicture();
//    private void oro(){
//        System.out.println("sg");
//    }
//    default void greet(){
//        oro();
//        System.out.println("hello welcome to my phone");
//    };//if we create new method inside interface we have to add this methd at every clasess so to overcome writing again n again we use default method which will be gone to all the classess in the interce is implemented
////    usecase: if we want to add to all the class this method without forcing
//}
//interface Wifi{
//    void internet();
//}
//class CellPhone{
//    void calling(){
//        System.out.println("calling");
//    }
//    void ringing(){
//        System.out.println("ringing");
//    }
//}
//class AndroidPhone extends CellPhone implements Camera,Wifi {
//    @Override
//    public void clickpicture() {
//        System.out.println("clicked ");
//    }
//    public void internet(){
//        System.out.println("internet working");
//    }
//    public void greet(){
//        System.out.println("asdfg");//if we have this method overridden then it run this not upper method
//    }
//}

//inheritance in interface -----------------------------------------------
//interface can be extend from another interface
//we can extend one interface to other but not one interface to other class
//interface  demo{
//    void main1();
//}
//interface  demo2 extends demo {
//    void main2();
//}
//class Myclass implements demo2{
//    public void main2(){
//        System.out.println("hello main2");
//    }
//    public void main1(){//we have to create main1 also because it is inherited from demo interface
//        System.out.println("main1");
//    }
//}


//---polymorphism with interface-----------------------------------------------------------------
//one thing which is used in different forms

//public class InterfaceEg {
//    public static void main(String[] args) {
//       Wifi obj = new AndroidPhone();
//       obj.internet();//runs
////       obj.calling();//not run :This is a ANDROIDphone but, use it as a WIFI ONLY as we are using the reference obj
////       obj.clickpictures();//not run : these will not run as we are calling androidphone to be wifi , by this user can use only wifi feature
//    }
//}

//interface Camera {
//    void clickpicture();
//}
//interface Wifi{
//    void internet();
//}
//class CellPhone{
//    void calling(){
//        System.out.println("calling");
//    }
//    void ringing(){
//        System.out.println("ringing");
//    }
//}
//class AndroidPhone extends CellPhone implements Camera,Wifi {
//    @Override
//    public void clickpicture() {
//        System.out.println("clicked ");
//    }
//    public void internet(){
//        System.out.println("internet working");
//    }
//    public void greet(){
//        System.out.println("asdfg");//if we have this method overridden then it run this not upper method
//    }
//}


//practise------------------------------------------------------------------------------------------------------


//Q1. Create an abstract class pen with methods write () and refill () as abstract methods

//abstract class  Pen{
//    abstract void write();
//    abstract void refill();
//
//}
//Q2.    Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()

//class Fountainpen extends Pen{
//    public void write(){
//
//    }
//    public void refill(){
//
//    }
//    public void Nib(){
//
//    }
//}

//    Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods create another class smart telephone and demonstrate polymorphism
//abstract class Telphone{
//    abstract void lift();
//    abstract void disconnected();
//
//}
//class Smarttelephone extends Telphone{
//    public void lift(){
//        System.out.println("ringing");
//    }
//    public void disconnected(){
//        System.out.println("disconnected");
//    }
//}
class Monkey{
    void jump(){
        System.out.println("jumping");
    }
    void bite(){
        System.out.println("biting");
    }
}
interface basicanimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements basicanimal{
    void speak(){
        System.out.println("speaking");
    }
   public void eat(){
       System.out.println("eating");
   }
    public void sleep(){
        System.out.println("sleeping");
    }
}


class InterfaceEg{
    public static void main(String[] args) {
        Human obj = new Human();
        obj.eat();
        Monkey obj2= new Human();
//        obj2.speak();//not allowed
        obj2.bite();
    }
}
