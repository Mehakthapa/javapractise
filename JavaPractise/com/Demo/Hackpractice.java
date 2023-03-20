package com.Demo;

import java.util.Scanner;

public class Hackpractice {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
//
//    int value = scan.nextInt();
//
////
//        if(value%2==0) {
//            System.out.println("Not Weird");
//        }
//        else{
//            System.out.println("Weird");
//
//        }



        int i = scan.nextInt();
        double d= scan.nextDouble();
//
        scan.nextLine();
        scan.nextLine();
        String s = scan.nextLine();
//        String t = scan.nextLine();

//        scan.nextLine();
////        When switching between reading tokens of input and reading a full line of input, you need to make another call to nextLine() because the Scanner object will read the rest of the line where its previous read left off; if there is nothing on the line, it simply consumes the newline and moves to the beginning of the next line.
////        In the code below, the nextDouble() method stops reading at the end of the second line of inpusdt, but does not move the Scanner object to the next (third) line. Because of this, the subsequent call to nextLine() reads the rest of the now-empty second line, consuming the newline and moving the Scanner to the beginning of the third line. Once the Scanner object is at the beginning of the third line, we can call nextLine() again and successfully read the line's contents.



        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
//        System.out.println("Int: " + t);
//        Scanner sc=new Scanner(System.in);
//
//
//
//        int x=sc.nextInt();
//        int y=sc.nextInt();
//        int z=sc.nextInt();
//
//        System.out.println("================================");
//        //Complete this line
//        System.out.println("java     " + x);
//        System.out.println("cpp      " + y);
//        System.out.println("python   " + z);
//        System.out.println("================================");

//----------------------rightway---------------------
//        System.out.println("================================");

//        for(int i=0;i<3;i++){
//            String s1=sc.next();
//            int x=sc.nextInt();
//            System.out.printf("%-14s %03d\n", s1, x);
//        }
//        System.out.println("================================");



    }

//    if(value%2==0 && value>2 && value<5){
//        System.out.println("not weird");
//    }
//        if(N%2==0 && N>6 && N<20){
//        System.out.println("weird");
//    }
//        if(N%2==0 && N>20){
//        System.out.println("not weird");
//    }

}
