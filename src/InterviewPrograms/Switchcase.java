package src.InterviewPrograms;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1-7 I will tell you the day name");
        int DayNumber= sc.nextInt();
        switch (DayNumber){

            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Frid");
                break;
            case 6:
                System.out.println("Satur");
                 break;
            case 7:
                System.out.println("Sun");
                break;
            default:
            {
                System.out.println("are you mad");
            }


        }
    }
}
