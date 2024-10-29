package src.InterviewPrograms;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner numb = new Scanner(System.in);
        System.out.println(" Enter an number");
         int number = numb.nextInt();



         if (number % 2 ==0){
             System.out.println("Number is even");
         }
         else {
             System.out.println("Number is odd");
         }


        numb.close();

    }


}
