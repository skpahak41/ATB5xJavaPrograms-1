package src.InterviewPrograms;

public class Find_Sum_of_Elements_in_Array {
    public static void main(String[] args) {
        int a[] = {5,2,7,9,6};
        int sum = 0;
        for (int i=0; i<=4; i++)
        {
        sum = sum +a[i];

        }
        System.out.println("Sum of array is: "+ sum);
    }
}
