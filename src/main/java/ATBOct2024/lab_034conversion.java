package ATBOct2024;

import java.util.Scanner;

public class lab_034conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display conversion choices
        System.out.println("Choose a conversion type:");
        System.out.println("1. Kilometer to Miles");
        System.out.println("2. Miles to Kilometer");
        System.out.println("3. Celsius to Fahrenheit");
        System.out.println("4. Fahrenheit to Celsius");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter kilometers:");
                double km = sc.nextDouble();
                System.out.println(km + " km = " + (km * 0.621371) + " miles"); //formula
                break;
            case 2:
                System.out.println("Enter miles:");
                double miles = sc.nextDouble();
                System.out.println(miles + " miles = " + (miles / 0.621371) + " km"); //formula
                break;
            case 3:
                System.out.println("Enter Celsius:");
                double celsius = sc.nextDouble();
                System.out.println(celsius + " °C = " + ((celsius * 9 / 5) + 32) + " °F"); //formula
                break;
            case 4:
                System.out.println("Enter Fahrenheit:");
                double fahrenheit = sc.nextDouble();
                System.out.println(fahrenheit + " °F = " + ((fahrenheit - 32) * 5 / 9) + " °C"); //formula
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
