package src.InterviewPrograms;

public interface Print_Even_And_Odd_Numbers_from_an_Array {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6};
        System.out.println("even numbers in array");
        for(int i= 0; i< a.length; i++ ){
            if (a[i]%2==0)
                System.out.println(a[i]);
        }
        System.out.println("odd numbers in array");
        for(int i= 0; i< a.length; i++ ) {
            if (a[i] % 2 != 0)
                System.out.println(a[i]);
        }
    }
}
