//package com.Demo;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
////EXCEPTION IS IN JAVA.LANG*******************
//
////public class exceptions {
////-----------------EXCEPTION HANDLING -----------------------------------
//
////    public static void main(String[] args) {
////        Scanner input = new Scanner(System.in);
////        int a = input.nextInt();
////        int b = input.nextInt();
//
////        System.out.println(a/b);//without try-catch- it will not move to rest code and stops if exceptions occurs
////        System.out.println("code end");
////        //with try-catch  it wil finish all the rest code without being stop
////        try{
////            System.out.println(a/b);
////        }
////        catch (ArithmeticException e){
////            System.out.println("arithmetic exception occurred " + e); // for specific exceptions
////        }
////        catch (Exception e){
////            System.out.println("cannot run the code as :" + e);// for rest exceptions
////        }
////        System.out.println("code end");
////
////    }
//
////  -------------------------------  EXCEPTION CLASS WITH METHODS ----------------------------------------------------------
//
////public static void main(String[] args) {
////    int a;
////    Scanner num =new Scanner(System.in);
////    a= num.nextInt();
////    if(a<9){
////        try{
////            throw new Myexception();
////        }
////        catch(Exception e){
////            System.out.println(e);//tostring is run by default
////            System.out.println(e.getMessage());
////            e.printStackTrace();
////            System.out.println("finished");
////
////
////        }
////    }
////}
////class Myexception extends Exception{
////    public String toString(){
////        return  "to string is run";
////    }
////    public String getMessage(){
////        return "get message is run";
////    }
//////
//////    ---------------------------throw and throws-----------------------------
//////
//////    public static double area(int r ){
//////        try{
//////            if(r<0){
//////                throw new  ArithmeticException();
//////            }
//////            else {
//////                double result= Math.PI * r * r;
//////                System.out.println(result);
//////                return result;
//////            }
//////        }
//////        catch (Exception e){
//////            System.out.println(e);
//////        }
//////        return 0;
//////    }
//////public static void main(String[] args) {
//////        Scanner input =  new Scanner(System.in);
//////        System.out.println("enter number");
//////        int radius = input.nextInt();
//////        area(radius);
//////
//////}
////}
//
////
////}
//
////public class exceptions {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////
////        try {
////            int first = sc.nextInt();
////            int second = sc.nextInt();
////            int result = first / second;
////            System.out.println(result);
////        }
//////        catch (Exception e){
//////            System.out.println(e);
//////        }
//////        or
////        //defining specific exceptions
////        catch (ArithmeticException e) {
////            System.out.println("arithematic exeption occured ");
////        } catch (InputMismatchException e) {
////            System.out.println("InputMismatchException occured , Please enter valid input ");
////        }
////
////    }
////}
//
//
////--------------------------------------------
//public class exceptions {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        //nested try-catch block --
//        try{
//            System.out.println("welcome");
//            try{//maybe we want to continue the particular try by handling the particular exception
//
//            }
//        }
//        catch (Exception e){
//
//        }
//    }
//}