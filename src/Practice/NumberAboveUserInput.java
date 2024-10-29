package src.Practice;

import java.util.Scanner;

public class NumberAboveUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number less than 100");

        int inputNumber = sc.nextInt();

        // Check if the input number is less than 100
        if (inputNumber < 100) {
            // Print numbers from the input number to 100
            System.out.println("Numbers from " + inputNumber + " to 100:");
            for (int i = inputNumber; i <= 100; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("OHH");
        }

        sc.close();
    }
}
