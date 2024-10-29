package src.InterviewPrograms;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        // Declaration
        HashMap map = new HashMap();
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        // Adding pairs
        hm.put(101, "John");
        hm.put(102, "Scott");
        hm.put(103, "Mary");
        hm.put(104, "David");
        hm.put(102, "Shivam");


        System.out.println(hm); // {101=John, 102=Shivam, 103=Mary, 104=David}

        System.out.println("Size of am Hash map:- " + hm.size()); //Size of am Hash map:- 4

        // Remove pair
        hm.remove(103);
        System.out.println("after Remove pair:- " + hm); // {101=John, 102=Shivam, 104=David}

        // access value of the key

        System.out.println(hm.get(102));  // 102 Shivam

        // Get all the key from hashmap

        System.out.println(hm.keySet()); // [101, 102, 104]
        System.out.println(hm.values()); // [John, Shivam, David]
        System.out.println(hm.entrySet()); // [101=John, 102=Shivam, 104=David]

        // Reading a data form the Hashmap
        // using for.. each
        /*

        for(int k:hm.keySet())
        {
            System.out.println(k+"      "+hm.get(k));

        }
        */

        // Using Iterator


    }

}
