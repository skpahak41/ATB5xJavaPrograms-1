package src.InterviewPrograms;

import java.util.Random;

public class Generate_Random_NumbersAndStrings {
    public static void main(String[] args) {
        Random rand = new Random();

        int rand_int = rand.nextInt(100);
        System.out.println(rand_int);

    }
}
