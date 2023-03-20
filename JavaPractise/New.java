import java.util.Scanner;

//public class New {
//    public static void main(String[] args) {
////       double i= 50.72;
////       int b = (int)i;
////        System.out.println(b);
////
//        Scanner sc = new Scanner(System.in);
////
////        System.out.println("enter number");
//        String even ="even";
//        String odd ="odd";
//
//        System.out.println("enter number");
//        int num = sc.nextInt();
//        String result = (num%2==0) ? even : odd;
//        System.out.println(result);
//
//
//
//
//    }
//}
public  class New {
    public static void main(String[] args) {
//        New.Stat INNER = new New.Stat();
        New.Stat.mthd();
        System.out.println( New.Stat.a);

        String name="mehak";
        int num =2;
        System.out.println(name + num);
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        String name3 =  "my name is mehak thapa";
        String substringvalue = name3.substring(4,9);//9 is not included
//        String substringvalue=name3.substring(4);
        System.out.println(substringvalue);



    }

    public static class Stat{
        public static void mthd(){//if method in it is not static than object of nested class has to be made
            System.out.println("hii ");
        }
        public static   int a=0;
    }

}
