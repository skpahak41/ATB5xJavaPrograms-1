package src.InterviewPrograms;
import java.util.Scanner;
public class ReverseNumWithUser_Input {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter a number to reverse: ");
        int num = scanner.nextInt(); // Get input from user
        System.out.println("Original number: " + num);

        String rev = ""; // Initialize rev as an empty String

        String numStr = String.valueOf(num); // Convert num to String
        for (int i = numStr.length() - 1; i >= 0; i--) {
            rev = rev + numStr.charAt(i); // Build the reversed string
        }
        System.out.println("Reverse number is: " + rev);

        scanner.close(); // Close the scanner
    }
}
