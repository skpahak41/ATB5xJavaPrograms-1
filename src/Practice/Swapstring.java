package src.Practice;

public class Swapstring {
    public static void main(String[] args) {
        String str1= "Hello", str2 = "World";
        System.out.println("previous:" + str1 + "  " + str2);

        str1 = str1 + str2 ;
        str2 = str1.substring(0,str1.length()-str2.length()) ;
        str1 = str1.substring(str2.length());

        System.out.println("After:" + str1 + "  " + str2);


    }
}
