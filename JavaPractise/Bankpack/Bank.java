package Bankpack;
import com.Demo.Access;



//.......---------------------concept of getter setter access modifiers -------------
public class Bank extends Access{

//    ------demo practice of access mod---------
//    public static void main(String[] args) {
//        Bank obj = new Bank();
////        int val =obj.d;//as d is default and cannot be accessed outside the package but can be accessed inside packgae
////        System.out.println(val);
//    }

//    ------------------------------
    public String name;//accessibe anywhere
    protected String account;//can be accsiible only inside its subclasses and itself
    String place; //can be accessible only inside its own package or class
    private String password ;//can be accessible only inside its own package or class//for accessing the private class we use getter and setters
//    public  void func(){
//        System.out.println(name);
//
//    }
//    public  void func2(){
//        System.out.println(account);
//
//    }
    public  String getPassword(){//getter

        return this.password;
    }
    public void setPassword(String pass){//setter
        this.password = pass;
    }
//    OR-------------------
//    public  String getPassword(){//getter
//        setPassword("abcd");
//        return this.password;
//    }
//    private void setPassword(String pass){//setter BY SEttING it private then cannot be accessed outside so we will pass it to getpassword to make it accessible
//        this.password = pass;
//    }
}
//Getter ➼   Returns the value  [accessors]
//        setter ➼    Sets / updates the value  [mutators]
//        In the below code, we've created total 4 methods:
//
//        setName(): The argument passed to this method is assigned to the private variable name.
//        getName(): The method returns the value set by the setName() method.
//        setId(): The integer argument passed to this method is assigned to the private variable id.
//        getId): This method returns the value set by the setId() method.