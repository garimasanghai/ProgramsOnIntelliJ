package ATBOct2024;

import java.util.Scanner;

public class lab_029switch_lowerUpperCaseHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String browser = sc.next();
        browser = browser.toLowerCase(); // ignore case
        switch (browser){
            case "chrome":
                System.out.println("Chrome browser initialising");
                System.out.println("Write the common line of code...");
                System.out.println("............");
                break;
            case"firefox":
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
