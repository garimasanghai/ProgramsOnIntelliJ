package ATBOct2024;

import java.util.Scanner;

public class lab_020 {
    public static void main(String[] args) {
        // There can be multiple conditions:
        //  1 ->  num1 >  num 2
        // 2 -> num2 > num1
        // 3 -> num1==num2

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Num 1 > Num2 ");
        } else if (num2 > num1) {
            System.out.println("Num 2 > Num1 ");
        } else {
            System.out.println("Equal");
        }
    }
}
