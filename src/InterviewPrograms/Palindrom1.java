package src.InterviewPrograms;

public class Palindrom1 {
    public static void main(String[] args) {
        String str = "ABCD";
        String rev = " ";

        int length = str.length();
        for (int i = length-1; i >=0; i-- ){
            rev =rev+str.charAt(i);

        }
        System.out.println("Reverse string"+rev);
    }
}
