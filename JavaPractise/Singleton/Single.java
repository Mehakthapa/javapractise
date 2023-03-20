package Singleton;

public class Single {
    public static void main(String[] args) {
//        Singleton obj = new Singleton();//as it is private
        Singleton obj = Singleton.getInstance();//main obj that is created
        Singleton obj1 = Singleton.getInstance();// points to the one object only i. of obj
        Singleton obj2 = Singleton.getInstance();//points to the one object only i. of obj

//all three objects are pointing to jus one object

    }
}
