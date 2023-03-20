package com.Demo;
//we know method overloading but if we want to add number of values then we use varargs to avoid creating method everytime
public class Varargs {
    public static void main(String[] args) {
        System.out.println(sum(3,5,6,8));
        System.out.println(sum(3));
    }

//    static int sum(int a , int b){
//       return a+b;
//    }
//    static int sum(int a , int b,int c){
//        return a+b+c;
//    }


//    to avoid this -------------------------
    static int  sum(int x,int ...arr){//x will be compulsory parameter and empty sum() will not sun
//        it will be available as int [] arr
        int result = 0;
        for (int a: arr
             ) {
            result += a;
        }
        return result;
    }
}

