package src.InterviewPrograms;

public class Factorial_of_a_Number {
    public static void main(String[] args) {
        int num = 5;
        long factorial = 1;

        for (int i= 1; i<=num; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial of a number is : " +factorial);
    }
}
