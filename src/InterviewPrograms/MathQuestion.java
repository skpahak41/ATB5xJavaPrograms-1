package src.InterviewPrograms;

import java.util.Scanner;

public class MathQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  X");
       double x = sc.nextDouble();

        System.out.println("enter the  y");
        double y = sc.nextDouble();

        System.out.println("enter the  z");
        double z = sc.nextDouble();

double result = 0;
result = Math.pow(x,2)+Math.pow(y,2)-Math.abs(z);
        System.out.println( result);
        sc.close();

    }
}
