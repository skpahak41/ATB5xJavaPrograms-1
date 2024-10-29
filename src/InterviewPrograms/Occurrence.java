package src.InterviewPrograms;

import java.util.HashMap;

public class Occurrence {
    public static void main(String[] args) {
        String input = "Automation";
        HashMap<Character, Integer> charCount= new HashMap<>();

        for (char c :input.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0)+1);

        }
charCount.forEach((key, value)-> System.out.println(key+":"+ value));
    }

}
