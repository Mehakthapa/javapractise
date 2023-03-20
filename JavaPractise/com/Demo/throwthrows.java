package com.Demo;

import java.security.PublicKey;

class mynegativeexp extends Exception{
    public String toString(){
        return "to string is called";
    }
    public String getMessage(){
        return "getmessage is called ";
    }
}
public class throwthrows {

    public static double area(int r) throws mynegativeexp{
        if(r<0){
            throw new mynegativeexp();
        }
        double result = Math.PI * r *r;
        return result;
    }
    public static void main(String[] args) {

        try{
            double ar = area(-4);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
