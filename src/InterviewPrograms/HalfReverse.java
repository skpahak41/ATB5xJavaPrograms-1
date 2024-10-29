package src.InterviewPrograms;

public class HalfReverse {

    public static void main(String[]args){

        String original = "My name is Shivam";
        System.out.println(original); // Print the original string

        // Split the original string into words
        String[] words = original.split(" ");

        // Reverse the specific words
        words[1] = new StringBuilder(words[1]).reverse().toString(); // Reverse "name"
        words[3] = new StringBuilder(words[3]).reverse().toString(); // Reverse "Shivam"

        // Join the words back into a single string
        String modified = String.join(" ", words);
        System.out.println(modified); // Print the modified string

    }

}
