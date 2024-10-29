package src.InterviewPrograms;

public class Laboo8 {
    public static void main(String[] args) {
        String name = "Pramod";
        System.out.println("Your name is: " + name); // Fixed the typo "nam" to "name"

        // Using String.format
        String formattedString = String.format("Your name is --> %s", name);
        System.out.println(formattedString);

        // Alternatively, using System.out.printf
        System.out.printf("Your name is --> %s%n", name);
    }
}

