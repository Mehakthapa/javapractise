package com.Demo;
//
//public class Innerclass {//outer class cannot be static because it is not dependent
////    class Inner { //will need Innerclass obj as it is dependent on its outer class
//   static class Inner{//if we make it static it is no longer dependent on its outer class objects  it can have its own objects
//          String name;
//
//        public Inner(String name) {
//            this.name = name;
//        }
//    }
//
//    public static void main(String[] args) {
////        Inner obj = new Inner("mehak");//this will say what is your outer object , it is dependent on some other class, if we put the Inner class outside the Innerclass then we it will run
////        Innerclass OBJ = new Innerclass();
////        Innerclass.Inner.name ="fghjkl";?????????????????????
////        Inner.name="df";//make variable static
////        System.out.println(obj.name);
//    }
//}
 public class  Innerclass{
    static class Inner {
        String name;

        public Inner(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
//        Inner obj =  new Inner("mehk");
//        String result = Inner.name;
//        System.out.println(result);
    }
}