package src.InterviewPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HasSetDemo {
    public static void main(String[] args) {
        // Declaration
        HashSet myset=new HashSet();
       // Set myset= new HashSet();
        // only string type deta
        //HashSet <String>myset= new HashSet<String>()
        // Adding elements into HashMap
        myset.add(100);
        myset.add(10.50);
        myset.add("Welcome");
        myset.add(true);
        myset.add('A');
        myset.add(100);
        myset.add(null);
        myset.add(null);

        System.out.println(myset); //[null, A, 100, 10.5, Welcome, true]

        // Removing element
        myset.remove(10.50);
        System.out.println("After removing:"+ myset); // [null, A, 100, Welcome, true]

        // increasing statement - not possibale
        // Access specifier element - not possible

        // convert HashSet --> ArrayList
        ArrayList al =new ArrayList(myset);
        System.out.println(al); // [null, A, 100, Welcome, true]
        System.out.println(al.get(2));

    }

}
