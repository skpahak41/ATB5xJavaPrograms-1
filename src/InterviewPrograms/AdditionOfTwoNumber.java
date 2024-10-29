package src.InterviewPrograms;
import java.util.Scanner;

public class AdditionOfTwoNumber {

    public static void main(String[]args){
        int a,c, sum;
        System.out.println("Enter two digit");
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        c= sc.nextInt();
        sum = a+c;

        System.out.println("Add of two number : " + sum);


    }
}
