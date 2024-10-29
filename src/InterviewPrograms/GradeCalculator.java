package src.InterviewPrograms;

import java.util.Scanner;

public class GradeCalculator {

    // 1. Input from user
    // Score(Data type) -> int  -> Grade ( char or String)
    // DAA- Ask for the confirmation of the doubts

    //A: 90-100
    //B: 80-89
    //C: 70-79
    //D: 60-69
    //F: 0-59

    // 1. Input from user
    // Score(Data type) -> int  -> Grade ( char or String)
    // DAA- Ask for the confirmation of the doubts


    // 2. Basic login or Brute force Logic write basic rough code
    // if score >= 90 && score  <=100 -> print A
    // else if score >= 80 && score  89 <= 100 -> print B


    // 3. Write the real code

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student score");
        int score = sc.nextInt();

        if (score >= 90 &&  score <=100)
        {
            System.out.println("Grage is ->A");
        }
        else if (score  >= 80 && score <= 90 )
        {
            System.out.println("Grage is ->B");
        }
        else if(score >= 70 && score <= 90)
        {
            System.out.println("Grage is ->c");
        }
        else {
            System.out.println("Grage is ->Pass");
        }


    }
}
