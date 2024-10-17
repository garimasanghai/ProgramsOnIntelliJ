package ScannerClass;
import java.util.Scanner;

//Take user input 2 num from arguments & cal the max in b/w with ternary operator
public class lab_018max_value {
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
