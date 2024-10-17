package ScannerClass;
import java.util.Scanner;

//Take a user input - Name, Age and Salary and print them in the end
public class lab_017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String username = sc.next();
        System.out.println("Age: ");
        int age = sc.nextInt();
        System.out.println("Salary: ");
        int salary = sc.nextInt();
        System.out.println("User details given");
        System.out.println("My name is : " + username);
        System.out.println("My age is : " + age );
        System.out.println("My salary is : " + salary);
        sc.close();
    }
}
