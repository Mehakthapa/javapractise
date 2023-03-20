package Singleton;

import javax.print.DocFlavor;

public class Singleton {
    private Singleton(){//to not allow anyone to create objects so first thing is to stop the constructor this will not let us to call the constructor outside the class

    }
    private static Singleton instance;

    public static Singleton getInstance(){ //function that will give us an instance /as we are accessing  it through class name so we put static
//        check whether the object is created or not if not then create it and if yes then return the created one to every one
        if(instance ==null ){
            instance = new Singleton();//AS WE CAN CREATE INSIDE ITS  CLASS
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton obj = new Singleton();//can call here
    }
}
