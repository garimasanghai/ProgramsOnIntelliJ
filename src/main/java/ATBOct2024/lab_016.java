package ATBOct2024;

import java.util.Scanner;

public class lab_016 {
    public static void main(String[] args) {
        //By using Scanner class, first create an instance of Scanner

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println(age>=25 ? "Solo trip allowed" : "Sit back at home");
        sc.close();
    }
}
