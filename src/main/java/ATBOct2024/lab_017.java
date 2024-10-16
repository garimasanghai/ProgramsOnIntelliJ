package ATBOct2024;

import java.util.Scanner;

public class lab_017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        System.out.println("Age: ");
        System.out.println("Salary: ");
        String username = sc.next();
        int age = sc.nextInt();
        int salary = sc.nextInt();
        System.out.println("My name is : " + username);
        System.out.println("My age is : " + age );
        System.out.println("My salary is : " + salary);
        sc.close();
    }
}
