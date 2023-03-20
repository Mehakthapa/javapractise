package com.Demo;

import Bankpack.Bank;

import java.rmi.activation.ActivationMonitor;

//-----------------------------class and objects -------------------------------------------------
//class Pen{
//    String color ;
//    String type;
//    public void write(){
//        System.out.println("your pen is beautiful");
//    }
//    public  void identify(){
//        System.out.println("pen color is " + this.color);
//    }
//
//}
public class Oops extends Bank{
//
//    public static void main(String[] args) {
//        Pen pen1 = new Pen();
//        Pen pen2 = new Pen();
//        pen1.color="blue";
//        pen1.type="ballpen";
//        pen2.color="black";
//        pen2.type="gel";
//        pen2.write();
//        pen1.identify();
//    }

//    -----------------constructors ---------------------------------------

//will automatically call doesnot need to call
//    public static void main(String[] args) {
//        Contructor obj = new Contructor();////non- parameterised constructor------------------
//        Contructor obj = new Contructor("mehak",22);////parameterised constructor------------------
//        obj.anyfunc();/////parameterised constructor--------------
//
//    }
//}
//class Contructor{
//    String name ;
//    int age;
//    public void anyfunc(){
//        System.out.println("any function");
//        System.out.println(this.name + this.age);//////parameterised constructor-----------------------
//    }
//    Contructor(){///////non-parametrized constructor----------------
//        System.out.println("constuctor is called everytime automatically");
//    }
//    Contructor(String name , int age){ ///////parameterised constructor -we doesnot have to initialize --------------------
//        this.name = name;
//        this.age = age;
//    }

//    ---------copy constructor --------------------------------

//    public static void main(String[] args) {
////        Copy obj = new Copy("mehak", "software developer");
//        Copy obj = new Copy();
//
//        obj.name ="mehak";
//        obj.designation ="software dev";
//        Copy C1 =new Copy(obj);
//
//        obj.studentfunc();
//
//    }


//    ------------------polymorphism ------------------------------------------------------------
//compile time--------
//    public static void main(String[] args) {
//        Poly obj1 = new Poly();
//        Poly obj2 = new Poly();
//        obj2.students("mehak" ,22);
//
//    }
//runtime----------------
//public static void main(String[] args) {
////    Pubg obj1 = new Pubg();
//    Game obj2 = new Game();
////    obj1.players();
//    obj2.players();
//}

//    --------------------inheritance------------------------------------------------
//public static void main(String[] args) {
////    ------------single----------------------------------
//    Iphone obj1 = new Iphone();
//    obj1.color="white";
//    obj1.type="iOS";
//    obj1.func();

//    -------------multilevel---------------------
//    Samsunggalaxy obj2= new Samsunggalaxy();
//    obj2.price = 34000;
//    obj2.func();
//}

//---------------packages and access modifiers and getter and setters --------------------------by this we can use another package info to our package and our package info to other

//public static void main(String[] args) {
//    Bank obj1 = new Bank();/* public and default by not writing something */
////    Oops obj2 = new Oops();//protected
////    obj1.name="HDFC";//public and default by not writing something
////    obj1.func();//public and default by not writing something
////    obj2.account = "asdfgfd";//protected for this we have to make the class extended from bank
////    obj2.func2();//protected
//    obj1.setPassword("mypass123");//setting password for  using private variable
//    System.out.println(obj1.getPassword());//getting password
//
//
//}

//-------------------abstraction main --------------------------------------------------
//---------------------abstract class
//    public static void main(String[] args) {
//        Horse obj1 = new Horse();
//        obj1.walk();
//        obj1.eats("grass");
//        Animal obj1 = new Animal();//error as its an abstract class

//    }
//    ----------------interfaces
//public static void main(String[] args) {
//    Horse obj1 = new Horse();
//    obj1.walk();
//    obj1.type();
//    obj1.var = 5;//we cannot change the value as they are final
//}

//    -----------------static----------------------------
//public static void main(String[] args) {
////    Student.school ="rainbow";same for all
//    Student obj1 = new Student();
//    obj1.school = "rainbow";
//    Student obj2 = new Student();
//    obj2.school = "english";
//    System.out.println(obj1.school);//;same for all
//    System.out.println(obj2.school);//same for all
//    obj2.demo();
//
//}
//}
//-------------copy constructor ---------------------------------------------------------

//class Copy{
//    String name ;
//    String designation;
//    public void studentfunc(){
//        System.out.println("hii gm");
//        System.out.println(this.name);
//        System.out.println(this.designation);
//
//    }
////    Copy(String name , String designation){
////        this.name = name;
////        this.designation = designation;
////    }
//    Copy(Copy C1){
//        this.name = C1.name;//its copying c1 values to its current object
//        this.designation=C1.designation;
//    }
//    Copy(){
//
//    }
//}

//-----------------polymorphism--------------------------------------------------------------------------
//compile time--------------
//class  Poly{
//    String name ;
//    int age;
//    public void students(){
//        System.out.println("student is called ");
//    }
//    public void students(String name , int age){
//        System.out.println("name " + name + " age " +age);
//    }
//}
//runtime-------------------
//class Game{
//    public void players(){
//        System.out.println("welcome to the game");
//    }
//}
//class Pubg extends Game{
//    public void players(){
//        System.out.println("welcome to the pubg");
//    }
//}

//------------------------single inheritance --------------------------------------------------------------------
//class  Mobile{
//    String type ;
//    String color;
//
//}
//
//class Iphone extends  Mobile {
//    public  void func(){
//        System.out.println("hello ");
//        System.out.println(type);
//    }
//}
//--------------multilevel------------------------------------------------------------------------------------------
//class  Android extends Mobile{
//    int price;
//    public void func(){
//        System.out.println("android is called");
//    }
//
//}
//class Samsunggalaxy extends Android{
//    public void func(){
//        System.out.println("price is " +price);
//    }
//}


//----------------abstraction--------------------------------------------------------------------------------------------

//-----------using abstract class

//abstract class  Animal {//as there is no use of animal class here so we make it abstract and we cannot initialized it now
//    abstract void walk();//as there is no use of walk here it only exists  so make it abstract and it will be compulsory to be in every subclass
//    void eats(String food){//we can also create simple function inside abstract class - this shows that its not a pure abstraction
//        System.out.println("it eats " + food );
//    }
//    Animal(){ //we can also write constructor inside it - first it will ne called as first base class will run
//        System.out.println("its an animal class ");
//    }
//
//}
//class Horse extends Animal{
//    public void walk(){
//        System.out.println("runs very fast");
//    }
//    Horse(){
//        System.out.println("its an horse class");
//    }
//}
//class Tortoise extends Animal{
//    public void walk(){
//        System.out.println("runs very slow");
//    }
//}

//-----------------using interfaces

//interface Animal{
//    int var =2;//we can define only fixed property it will be same for all animals - by default public static and final
//    void walks();///all methods inside interface are abstract and public by default no need to write abstract or public here but when we are writing func in another subclass we have to define public as thats not an interface  - we cannot make normal function inside interface , there should be no non-abstract function inside interface and we cannot contain constructor also
////    whatever we make function inside interface it should be there in subclasses
//
//}
//class Horse implements Animal{//should contain walks function
//    public void walks(){
//        System.out.println("horse is running");
//    }
//}

//-----------------------multiple inheritance(2 base classes and one  using interface ------------------------------
//interface Animal{
//    void walk();
//}
//interface Herbivor{
//    void type();
//}
//class  Horse implements Animal ,Herbivor{
//    public void walk(){
//        System.out.println("horse is running ");
//    }
//    public void  type(){
//        System.out.println("horse is herbivor animal");
//    }
//}

//---------------------static keyword ------------------------------------
//static properties are that which are common for class
//class  Student {
//    String name;
//    static String school;
//
//    public static void change() {
//        school="changed";
//    }
//
//    public void demo() {
//        System.out.println(school);
//    }
}
