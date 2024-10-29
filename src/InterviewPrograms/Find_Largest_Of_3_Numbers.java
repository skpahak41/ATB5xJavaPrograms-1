package src.InterviewPrograms;

import java.util.Scanner;

public class Find_Largest_Of_3_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter first number");
        int b = sc.nextInt();

        System.out.println("Enter first number");
        int c = sc.nextInt();

        if (a>b && a>c){
            System.out.println( a + " A is largest number");
        }
        else if (b>c && b>a) {
            System.out.println( b+ " B is Largest number");
        }
        else{
            System.out.println( c+ " is Largest number");
        }


    }
}
