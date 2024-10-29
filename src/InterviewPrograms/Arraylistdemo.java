package src.InterviewPrograms;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Arraylistdemo {
    public static void main(String[] args) {
        // Delcleration of the class
        ArrayList mylist= new ArrayList();
        // list mylist = new ArrayList();
        // ArrayList <String> mylist= new ArrayList<String>()
        // Adding data into array list
        mylist.add(100);
        mylist.add(10.5);
        mylist.add("Welcome");
        mylist.add('A');
        mylist.add(true);
        mylist.add(100);
        mylist.add(null);
        mylist.add(null);

        // Size of an array
        System.out.println("Size of an aray list:" +mylist.size());
        System.out.println("Printing data from arraylist:"+mylist);

        //Remove some element from arraylist
        mylist.remove(5);
        System.out.println("After removing the array list:" +mylist);

        // Insert ans element in between
        mylist.add(2,"java");
        System.out.println("After insertion:"+mylist);
        // Modifying element or replacement or change
        mylist.set(2,"Python");
        System.out.println("After Replacing:"+mylist); //100, 10.5, Python, Welcome, A, true, null, null
        // extract element fro array list
        mylist.get(3);
        System.out.println(mylist.get(3)); //Welcome
        // reading all the element from array list
        // using normal for loop
       /* for(int i = 0; i< mylist.size(); i++)
        {
            System.out.println(mylist.get(i));


        }
      */
        // using enhanced for loop... for..each  loop

        /*for(Object x: mylist)
        {
            System.out.println(x);

        }
       */

        // using Iterator
        Iterator it=mylist.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        // checking array list is empty or not.
        System.out.println("Is arraylist empty ?- "+mylist.isEmpty() );

        // Remove all the arraylist
        ArrayList mylist2=new ArrayList();
        mylist2.add(100);
        mylist2.add("Welcome");

        mylist.removeAll(mylist2);
        System.out.println("After removing multiple elements;"+mylist);

        //remove the element/clear
        mylist.clear();
        System.out.println("is Araylist empty -"+mylist.isEmpty());  // true
    }
}
