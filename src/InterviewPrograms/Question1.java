package src.InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class Question1 {
    public static void main(String[] args) {
        String input = " Hello"; // Changed variable name to lowercase
        Map<Character, Integer> charCountMap = new HashMap<>(); // Changed variable name for clarity

        char[] chars = input.toCharArray();
        for (char ch : chars) {
            // Increment the count for the character
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print the character counts
        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}