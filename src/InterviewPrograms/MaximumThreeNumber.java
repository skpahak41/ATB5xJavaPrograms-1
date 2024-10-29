package src.InterviewPrograms;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MaximumThreeNumber {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = input.nextInt();

        System.out.println("Enter second number");
        int secondNumber = input.nextInt();

        System.out.println("Enter Third number");
        int thirdNumber = input.nextInt();

            int maximum = firstNumber;

            if (firstNumber > maximum);
        {
            maximum = secondNumber;
        }
        if (secondNumber > maximum);
        {
            maximum = thirdNumber;
        }


        System.out.println(" max of the three number: "+maximum);

        input.close();

    }



}
