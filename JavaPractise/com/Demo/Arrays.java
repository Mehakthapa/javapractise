//package com.Demo;
//
//import java.util.Scanner;
//
public class Arrays {
    public static void main(String[] args) {
////        int [] values = new int[5];
////        //or
//////        int values[] = new int[5];
////        values[0]= 3;
////        values[1]= 5;
////        values[2]= 43;
////        values[3]= 35;
////        values[4]= 93;
//
//        //or
//        // if we know the elements which we are storing then we can write array as:
////        ****** int [] marks ={4,6,78,90,40};
//
////        System.out.println(values);//will print the address
////        System.out.println(values[1]);
////
////        for (int i =0; i<3;i++){
////            System.out.println(values[i]);
////        }
//
////        Scanner myarr = new Scanner(System.in);
////        System.out.println("enter size of array");
////        int numbers = myarr.nextInt();
////
////        int num[] = new int[numbers];
////
////        System.out.println("enter values");
////        // for input
////        for (int i=0;i<numbers;i++){
////             num[i] = myarr.nextInt();
////        }
////        //for output
////        for (int i=0;i<numbers;i++){
////            System.out.println(num[i]);
////        }
//        //it means that whatever we declare a variable , it takes the space inside m/m
//        //if it is object it store null, if it is integer it stores 0
//        // if it is float then it stores 0.0
//        // if it boolean then it stores false by default
//        // if it string then it stores empty string
//        // and if it is int array then it stores 0 0 on every space
////      // so it stores automatically 0 to all as we haven't store any value ye but only declared'


////-----------------example -----------------------------------------
//
//
////        Scanner input = new Scanner(System.in);
////        System.out.println("enter size");
////        int size = input.nextInt();
////
////
////        int arr[] = new int[size];
////
////        System.out.println("enter values ");
////
////        for(int i=0; i<size;i++){
////            arr[i] =input.nextInt();
////        }
////        for (int i=0;i<size;i++){
////            System.out.println(arr[i]);
////        }
////
////        System.out.println("enter value to search");
////        int search = input.nextInt();
////        for (int i=0;i<arr.length;i++){
////            if(arr[i]==search){
////                System.out.println("value found on "+ i);
////            }
////            else{
////                System.out.println("number not found");
////            }
////        }
////    }
//
//
// Displaying the 2-D Array (for loop)------------------------------------------------
// int flats [][] = new int[2][3];
//            System.out.println("Printing a 2-D array using for loop");
//                for(int i=0;i<flats.length;i++){ //first array
//                    for(int j=0;j<flats[i].length;j++) { //second array runs until i i.e 3
//                        System.out.print(flats[i][j]);
//                        System.out.print(" ");
//                    }
//                    System.out.println("");//for seperating
//                }
//---------------------------------------------------------------------------------------------------
////        Qs. Take a matrix as input from the user. Search for a
////        given number x and print the indices at which it occurs./2-d arrays
//
////        Scanner input = new Scanner(System.in);
////        System.out.println("enter number rows you want ");
////        int rows = input.nextInt();
////        System.out.println("enter number of columns u want");
////        int columns = input.nextInt();
////        System.out.println("enter numbers inside matrix");
////        int numbers[][] = new int[rows][columns];
////        for (int i = 0; i < rows; i++) {
////            for (int j = 0; j < columns; j++) {
////                numbers[i][j] = input.nextInt();
////            }
////        }
////        System.out.println("enter number to search");
////        int search = input.nextInt();
////        for (int i = 0; i < rows; i++) {
////            for (int j = 0; j < columns; j++) {
////                if (numbers[i][j] == search) {
////                    System.out.println("found at " + i + "and " +j);
////                }
////            }
////        }
//--------------------------------------practise------------------------------
//Q: Create an array of 5 floats and calculate their sum.
//        float arr [] = { 3.3f,4.5f,6.0f,5.5f };
//        float result =0 ;
//        for (int i=0;i<arr.length;i++){
//            result = result + arr[i];
//        }
//        System.out.println(result);

// ---------------

//Q: Write a program to find out whether a given integer is present in an array or not.
//        float search =5.5f;
//        for (int j=0;j< arr.length;j++){
//            if(arr[j]==search){
//                System.out.println("number is present ");
//            }
//            else {
//                System.out.println("number is not present");
//            }
//            break;//we will not use break here as this will run only one time
//        }

//        so----------------------------------------------------

//        boolean ispresent =false;
//        for (float element: arr
//             ) {
//            if(search==element){
//                ispresent=true;
//                break;
//            }
//
//        }
//        if(ispresent==true){
//            System.out.println("present");
//        }
//        else {
//            System.out.println("not present");
//        }

//        Q:Calculate the average marks from an array containing marks of all students in physics using a for-each loop

//        int marks[] = {90,65,76,55,44};
//        int total =0;
//        for (int ele: marks
//             ) {
//            total = total +ele;
//        }
//        System.out.println(total);

//        Q: Create a Java program to add two matrices of size 2x3

//        int twoD[][] = new int[2][3];
//        twoD[0][0] =12;
//        twoD[0][1] =2;
//        twoD[0][2] =11;
//        twoD[1][0] =22;
//        twoD[1][1] =12;
//        twoD[1][2] =32;
//
//        int res=0;
//        for(int i=0; i<twoD.length;i++){
//            for (int j=0;j<twoD[i].length;j++){
//                res = res+ twoD[i][j];
//            }
//        }
//        System.out.println(res);
        
//        --------------------------------
//        int [][] mat1 = {{1, 2, 3},
//                {4, 5, 6}};
//        int [][] mat2 = {{2, 6, 13},
//                {3, 7, 1}};
//        int [][] result = {{0, 0, 0},
//                {0, 0, 0}};
//
//        for (int i=0;i<mat1.length;i++){ // row number of times
//            for (int j=0;j<mat1[i].length;j++) { // column number of time
//                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }


//        Q:identify array is sorted or not

//        boolean isSorted = true;
//        int [] arr = {1, 12, 3, 4, 5, 34, 67};
//        System.out.println(arr);
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i] > arr[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        if(isSorted){
//            System.out.println("The Array is sorted");
//        }
//        else{
//            System.out.println("The Array is not sorted");
//        }





////        ---------------------------------STRING---------------------------------------------------------------------
//
//        String name =  "my name is mehak thapa";
////        String substringvalue = name.substring(4,9);//9 is not included
//        String substringvalue=name.substring(4);
//        System.out.println(substringvalue);
//
//        //without string builder if you want to modify a string
////        String str = "MY";
////        String str2 = str + "name";
////        String str3 = str2 + "is Mehak";
////        System.out.println(str3);///it takes lot of time
//
//
//        //with query builder
//        StringBuilder strb = new StringBuilder("My");
////        strb.append("name");// with the help of append method
////        strb.append("is mehak");
////        System.out.println(strb);
//
////       Get A Character from Index
////        System.out.println(strb.charAt(4));
////
//////        set a character at
////        strb.setCharAt(8,'M');
////        System.out.println(strb);
////
//////        inserting
////        strb.insert(3,"mehak");
////        System.out.println(strb);
////
////        strb.delete(3,8);
////        System.out.println(strb);
//
//
//
////        reversing a string
//        for (int i=0 ; i<strb.length()/2;i++){
//            int front =i;
//            int back = strb.length() - 1 -i;
//
//            char frontcheck = strb.charAt(front);
//            char backcheck = strb.charAt(back);
//
//            strb.setCharAt(frontcheck,backcheck);
//            strb.setCharAt(backcheck,frontcheck);
//        }
//        System.out.println(strb);
    }
//
}
