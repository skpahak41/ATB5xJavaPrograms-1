package src.InterviewPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class switchPrograme {
    public static void main(String[]args){
        // which dat is today
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number i will say you the day ");

        // 1= monda, 2= Tuesday, 3 = wednesday, etc
        int dayNumber  = sc.nextInt();

        String day = null;
        switch (dayNumber){
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                    System.out.println("tuesday");
                    break;
            case 3:
                    System.out.println("Wednesday");
                    break;
            case 4:
                    System.out.println("Thursday");
                    break;
            case 5:
                    System.out.println("Friday ");
                    break;
            case 6:
                    System.out.println("Saturday");
                    break;
            case 7:
                    System.out.println("Sunday");
                    break;
            default:
                System.out.println("Are you mad");
            }


        }




    }


