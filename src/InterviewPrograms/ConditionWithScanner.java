package src.InterviewPrograms;

import java.util.Scanner;

public class ConditionWithScanner {
    public static void main(String[] args) {

        Scanner shivsm =new Scanner(System.in);
        int number = shivsm.nextInt();
        if (number > 20 )
        {
            System.out.println("This is > 20");
        }
        else{
            System.out.println("This number is < 20");
      }
        System.out.println();
    }
}
