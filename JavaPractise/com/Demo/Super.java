package com.Demo;

public class Super {
    public static void main(String[] args) {
//        Box obj = new Box(9,5,10);
//        System.out.println(obj.l + obj.w + obj.h);
//        obj.info();
//        Box ob3 = new Box(obj);
//        System.out.println(ob3.l);

//        Box2 obj2 = new Box2();//
//        FOR TAKING Values from parent
//        System.out.println(obj2.l);

//        Box2 obj2 = new Box2(5,6,7, 90);//
//        System.out.println(obj2.weight);

//        Box obj2 = new Box2(3,4,5,4);//will work - Box2 is searching box
//        Box2 obj3 = new Box(34,4,4);//will not work  when the object is of type parent class then how can we call the constructor of child class
//        box is searching in Box2 - we cannot have a child reference variable and a parent object

//        upper classes don't know what classes are downward but downward classes now what classes are above

//        Box2 obj2 = new Box2();//if super is without parameter
//        System.out.println( obj2.l);
        Box2 obj3 = new Box2(3,4,5,5);//if super is with parameter
        System.out.println( obj3.l);
    }

}
class Box {
    double l;
    double w;
    double h;

    @Override
    public String toString() {
        return "Box{" +
                "l=" + l +
                ", w=" + w +
                ", h=" + h +
                '}';
    }

    Box(){
//        super();//refering to object class as there is not parent class of it and it is itself a parent  - every class we made has an object as a super class
        this.l =-1;
        this.w =-1;
        this.h =-1;

    }

    public Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box other ){
        this.l = other.l ;
        this.h = other.h ;
        this.w = other.w ;

    }
    public void info(){
        System.out.println("hello box");
    }

}
class Box2 extends Box{
    double weight;

    public Box2() {
        this.weight = -1;
    }

    public Box2(double l, double w, double h, double weight) {
//        super();//without parameter
        super(l,w,h);//this is taking the value from parent - saying call the parent class constructor
        System.out.println(super.w);
        this.weight = weight;
    }
}
