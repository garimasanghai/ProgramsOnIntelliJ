package ATBOct2024;

import java.util.Scanner;

public class lab_018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int a = sc.nextInt();
        System.out.println("Enter second num: ");
        int b = sc.nextInt();
        int maxVal = (a>b ? a:b);
        System.out.println("The maximum value is: " + maxVal);
        sc.close();

    }
}