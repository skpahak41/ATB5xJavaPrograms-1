package src.InterviewPrograms;

    public class Check_Given_Number_is_Prime_Or_Not {
        public static void main(String[] args) {
            int num = 5;
            int count = 0;
            if (num > 1) {
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0)
                        count++;
                }
            }
            if (count == 2) {
                System.out.println("Number is prime ");
            } else {
                System.out.println(" Number is not prime");
            }

        }
    }


