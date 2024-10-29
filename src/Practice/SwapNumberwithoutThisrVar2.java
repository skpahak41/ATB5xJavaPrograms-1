package src.Practice;

public class SwapNumberwithoutThisrVar2 {
    public static void main(String[] args) {
        int a = 10, b = 20 ;
        System.out.println("before swaping : " + a + "   "+b);

        a = a * b;
        b  = a / b;
        a =  a/ b;

        System.out.println("after swaping : " +a+ "   "+b);
    }
}