package src.Practice;

public class FactorialReverse {
    public static void main(String[] args) {
        int num = 5;
        long factorial = 1;
        for (int i=num; i>=1; i--){
        factorial = factorial*i;
        }
        System.out.println("Factorial Number is :"+ factorial);
    }
}
