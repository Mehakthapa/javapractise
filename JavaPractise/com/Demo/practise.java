package com.Demo;

import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("enter number ");
            int number = input.nextInt();
            if(number%2==0){
                System.out.println("number is even");
            }
            else {
                System.out.println("number is odd");
            }
        } catch (Exception e ){
            System.out.println("error>>>>>>"+e);
        }
    }
}
