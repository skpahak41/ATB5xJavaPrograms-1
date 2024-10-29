package src.InterviewPrograms;

public class WhileLoop04 {

    /// 1.....10
    /*1- odd number
    2- even number
    3- odd getNumber
    4- even getNumber
          */

    public static void main(String[] args) {
        int i = 1;
        while(i<= 10){
            if (i%2==0) {
                System.out.println(i + "even number");
            }
            else{
                System.out.println(i+ "Odd number");
            }
            i++;
            }

        }


    }

