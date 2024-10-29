package src.InterviewPrograms;

public class Generate_Fibonacci_series {
    public static void main(String[] args) {

        int n1= 1, n2= 2, n3;

        System.out.println(n1);
        System.out.println(n2);

        for (int i = 0; i<8; i ++){
            n3 = n1 +n2;
            System.out.println(n3);
            n1 = n2 ;
            n2 = n3 ;
        }

    }
}
