package src.InterviewPrograms;

import java.sql.SQLOutput;

public class PawanSwapTwoNumber01 {
    public static void main(String[] args) {
        int a= 10, b= 20;

        System.out.println( "Before swapping value : " +a +" "+b );
        int t= a;
        a=b;
        b=t;
        System.out.println("After swaping" +a+"  "+b );

    }
}
