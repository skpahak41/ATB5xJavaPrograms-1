package src.Practice;

public class SwapWithoutThirdVar {
    public static void main(String[] args) {
        // Using + and -
        int a = 10, b = 20;
        System.out.println("Previous: " + a + "  " + b);

        a = a + b;  // Step 1: a now holds the sum of a and b
        b = a - b;  // Step 2: b now holds the original value of a
        a = a - b;  // Step 3: a now holds the original value of b

        System.out.println("After swapping: " + a + "  " + b);
    }
}