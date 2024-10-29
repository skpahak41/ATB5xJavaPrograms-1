package src.Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MaxOfTwoNumbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter first number");
        int a= sc.nextInt();

        System.out.println("Enter second number");
        int b= sc.nextInt();

        System.out.println("Enter third number");
        int c= sc.nextInt();

        if (a>b && b>c){
            System.out.println(a+ "Largest number");
        }

        else if (b>a && b>c){
            System.out.println(b+ "Largest number");
        }
        else {
            System.out.println(c+ "Largest number");
        }

        sc.close();
    }
}
