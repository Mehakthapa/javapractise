package com.Demo;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {

//        example-------------------------------
//        *****
//        *****
//        *****
//        ***** rectangle
//        first try to solve this *
//                                *
//                                *
//                                *
//        then for columns also solve it then combine both and we have written print here as we dont want stars to be print on nextline
//        for(int i = 1 ; i<=4 ; i++){
//            for (int j=1;j<=5;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        example-------------------------------------------------------------

//        *****
//        *   *
//        *   *
//        ***** hollow rectangle
//        rows work done by - outer loops
//            columns work done inner loops
//        means whenever we have j=1,i=1,i=4,j=5 print * else print space as doc refere to doc for more info
//        we have observe that i ki value ya toh 1 ya toh 5 h
//        for(int i=1;i<=4;i++){
//            for (int j=1;j<=5;j++){
//                if(j==1 || i==1 || j==5 || i==4){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        example -------------------------------------------------------------------

//        *
//        **
//        ***
//        **** half pyramid
//as if i=1 star print one star
//                i=2 it prints 2 stars so j is equal to i
//        for (int i=1; i<=4;i++){
//            for (int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for reverse
//                ****
//                ***
//                **
//                *
//        for (int i=4; i>=1;i--){
//            for (int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//------------------------------------------------------------------------------------------------




    }
}
