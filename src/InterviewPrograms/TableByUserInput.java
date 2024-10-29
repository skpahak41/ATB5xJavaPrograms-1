package src.InterviewPrograms;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class TableByUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table you  would like to print");

        int number = sc.nextInt();
        System.out.println("Multiplation table of "  +number+ ":");
        for (int i = 1 ; i <=10 ; i++){
            System.out.println(number+ " X " +i+ " = " + (number * i));
        }

    }
}
