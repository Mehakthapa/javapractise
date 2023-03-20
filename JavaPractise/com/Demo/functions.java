package com.Demo;

import java.util.Scanner;

public class functions {
//    -------------------------------eg1---------------------------------------------
    static void  sum(int num1 , int num2){//access modifier is default here
        //if we are not writing static then we have to write the object as
//        functions obj = new functions();
//          int c = obj.sum(a,b)
        System.out.println("addition is :"+ (num1+num2));
    }
    public static void  sub(int num1 , int num2){
        System.out.println("subtraction is : " +(num1-num2));
        return;
    }
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("enter value1");
        int value1 = number.nextInt();
        System.out.println("enter value2");
        int value2 = number.nextInt();
        sum(value1,value2);
        sub(value1,value2);
    }
//    -----------------------eg2---------------------------------------------------------
//    Enter 3 numbers from the user & make a function to print their average.
//    public static  void  average(int value1 , int value2, int value3, int value4 , int value5){
//        int averagevalue= (value1 + value2 + value3 +value4 +value5)/5;
//        System.out.println(averagevalue);
//    }
//
//    public static void main(String[] args) {
//        Scanner user = new Scanner(System.in);
//        System.out.println("enter number one");
//        int num1 = user.nextInt();
//        System.out.println("enter number two");
//        int num2 = user.nextInt();
//        System.out.println("enter number three");
//        int num3 = user.nextInt();
//        System.out.println("enter number four");
//        int num4 = user.nextInt();
//        System.out.println("enter number five");
//        int num5 = user.nextInt();
//
//        average(num1, num2,num3,num4,num5);
//
//
//
//    }

//    -----------------------eg3---------------------------------------------------------

//    Write a function to print the sum of all odd numbers from 1 to n.
//public static void main(String[] args) {
//    Scanner total = new Scanner(System.in);
//    int values = total.nextInt();
//    int sum=0;
//    for (int i =0 ; i<values;i++){
//        if(i%2!=0) {
//            sum = sum + i;
//        }
//
//    }
//    System.out.println(sum);
//}
//---------------------------infinite loop-------------------------------------
//    public static void main(String args[]) {
//        do {
//            System.out.println("vvv");
//
//        } while(true);
//    }




}


