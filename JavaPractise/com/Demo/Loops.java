package com.Demo;

public class Loops {
    public static void main(String[] args) {
//--------------------------LOOPS------------------------------

        for (int count=0; count<11 ;count++) System.out.println(count);//for loop
//        -------while loop--------------
        int i=0;//while loop jab tak ye condition reach nhi ho jaati kaam krte rahiye
        while (i<11){
            System.out.println(i);
            i=i+1;
        }
//        ----------------do while--------------------
//        int i=0;// work will done one time definitely whether condition is true or false
//        do {
//            System.out.println(i);
//            i=i+1;
//        }
//        while (i<11);

//        ------------------------example----------------------
//        Scanner value = new Scanner(System.in);
//        int x = value.nextInt();
//        int sum =0;
//        for(int i=1; i<=x; i++){
//            sum= sum+i;
//            System.out.println(i);
//        }
//        System.out.println(sum);
//        -------------------example---------------------
//        Scanner number = new Scanner(System.in);
//        int table = number.nextInt();
//        for(int i=0; i<11 ; i++){
//            System.out.println(table*i);
//        }

//---------------loops for array--------------------------

//        -------------------For Each Loop---------------------------------------------------------------------
//        For each loop is an enhanced version of for loop.
//                It travels each element of the data structure one by one.
//        Note that you can not skip any element in for loop and it is also not possible to traverse elements in reverse order with the help of for each loop.
//        It increases the readability of the code.
//                If you just want to simply traverse an array from start to end then it is recommended to use for each loop.
//        Syntax :
///* for (int element:Arr) {
//            Sout(element);    //Prints all the elements
//} */
//        int [] arr = {3,4,5,6,6};
//        System.out.println(arr.length);
////        for loop-------------------
//        for (int i=0 ; i<arr.length;i++){//by for loop
//            System.out.println(arr[i]); //array traversal
//        }
//        for (int i= arr.length-1 ; i>=0; i--){//by for loop for reverse order printing
//            System.out.println(arr[i]); //array traversal
//        }

//        while---------------------------
//        int i=0;
//        while (i<arr.length){
//            System.out.println(arr[i]);
//            i++;
//        }
//
////        for each----------------------
//        for (int element: arr
//             ) {
//            System.out.println(element);
//        }

    }

}
