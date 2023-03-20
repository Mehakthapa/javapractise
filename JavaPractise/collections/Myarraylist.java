package  collections;
import  java.util.ArrayList;
import java.util.Collections;

public class Myarraylist {

    public static void main(String[] args) {
//        ArrayList

        ArrayList<Integer> mylist = new ArrayList<>();
        //add
        mylist.add(5);
        mylist.add(20);
        mylist.add(25);
        mylist.add(5);
        mylist.add(25);
        System.out.println(mylist);

        //add in b/w
        mylist.add(2,20);
        System.out.println(mylist);

        //replace or change element
        mylist.set(1,1);
        System.out.println(mylist);

        //get the element
        System.out.println(mylist.get(2));

        //remove/delete
        mylist.remove(2);
        System.out.println(mylist);

        //get size/length
        System.out.println(mylist.size());

        //iterate
        for(int i=0 ; i< mylist.size();i++){
            System.out.println(mylist.get(i));
        }

        //sorting
        Collections.sort(mylist);
        System.out.println(mylist);

        System.out.println( mylist.indexOf(5));//if have three times 5 thn it return the first occurrance index

        System.out.println( mylist.lastIndexOf(5));//return index of last occurrence
//        Returns the index of the last occurrence of the specified element in this list

        System.out.println( mylist.isEmpty());//Returns true if this list contains no elements.
        System.out.println( mylist.contains(5));//Returns true if this list contains the specified  elements.
        System.out.println( mylist.clone());//Returns a shallow copy of this ArrayList instance.


        ArrayList<Integer> mylist2 = new ArrayList<>();

        mylist2.add(34);
        mylist.addAll(mylist2);//it will put all the values of arraylist mylist2 to mylist1
        mylist2.addAll(mylist);
        System.out.println(mylist2);
        System.out.println(mylist);



    }
}

//400gm fibers
//vit b12
//protien - hairloss
//
//16-18
//necotin
