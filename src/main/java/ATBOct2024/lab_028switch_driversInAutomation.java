package ATBOct2024;

import java.util.Scanner;

// Web Automation
// I will ask user which browser you want me to run the code.
// chrome -> execute chrome
// firefox -> execute of firefox
// edge -> edge browser cases.

public class lab_028switch_driversInAutomation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser :");
        String browser = sc.next();
        switch (browser){
            case "chrome":
                System.out.println("Chrome browser initialising");
                System.out.println("Write the common line of code...");
                System.out.println("............");
                break;
            case "firefox":
                System.out.println("Firefox browser initialising");
                System.out.println("Write the common line of code...");
                System.out.println("............");
                break;
            case "edge":
                System.out.println("Edge browser initialising");
                System.out.println("Write the common line of code...");
                System.out.println("............");
                break;
            default:
                System.out.println("Browser not supported by this IDE");
                break;
        }
        System.out.println("Browser is initialised, Proceed with Test methods");
        sc.close();
    }
}
