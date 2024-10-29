package src.InterviewPrograms;

import javax.lang.model.util.Elements;
import java.util.Scanner;

public class PalendromProgram {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("give me text to check palindrom");
        String user_input = scanner.next();
        boolean result = isPalindrom(user_input);
        if (result) {
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not a palindrom");
        }
    }

    private static boolean isPalindrom(String userInput) {
        String original_str = userInput;// Pramod
        StringBuilder sb = new StringBuilder(userInput);
        sb.reverse();
        return original_str.equalsIgnoreCase(sb.toString());
    }
}
