package src.InterviewPrograms;

public class Print_Even_And_Odd_Numbers_from_an_ArrayUsing_ForEach_Loop {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        System.out.println("Even number");
        for(int value :a)
        {
            if( value % 2 == 0 )

                System.out.println(value);
        }

        System.out.println("Odd number");
        for(int value :a)
        {
            if ( value % 2 != 0 )
                System.out.println(value);
        }

    }
}
