package src.InterviewPrograms;

import java.util.Arrays;

public class How_To_Check_The_Equality_Of_Two_Arrays {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {1, 2, 3, 4, 5};
        boolean Status = Arrays.equals(a1, a2);

        if (Status == true) {
            System.out.println("Arrays are equals");
        } else {
            System.out.println("arrays are not equal");
        }

    }
}
