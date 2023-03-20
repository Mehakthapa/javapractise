package com.Demo;

public class Access {
//    for accessing outside -----------
//    public int  a =3;
//    protected int  b =2;
//    private int  c =38;
//    int d =3;//default
    public static void main(String[] args) {
        Modifier obj = new Modifier();
        obj.print();
//        int result  = obj.c;//cant run outside class as it is private
//        System.out.println(result);

    }

//    private int  s =38;//can be run inside its class only
//    public static void main(String[] args) {
//
//        Access obj = new Access();
//        int result = obj.s;
//        System.out.println(result);
//    }

}
class Modifier{
    public int  a =3;
    protected int  b =2;
    private int  c =38;
    int d =3;//default

    void print(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }



}
