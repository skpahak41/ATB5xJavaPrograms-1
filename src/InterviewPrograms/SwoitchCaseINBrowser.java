package src.InterviewPrograms;

import java.util.Scanner;

public class SwoitchCaseINBrowser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name,Firefox, Mozilla, Chrome ");
        String browser = sc.nextLine();
        switch (browser){
            case "Firefox":
                System.out.println("Firefox");
                break;
            case "Mozzila":
                System.out.println("Mozzila");
                break;
            case "Chrome":
                System.out.println("Chrome");
                break;
            default:
                System.out.println("are you mad");

        }

    }
}
