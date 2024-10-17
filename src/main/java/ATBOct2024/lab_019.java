package ATBOct2024;

import java.util.Scanner;

public class lab_019 {
    public static void main(String[] args) {
        // Create a Program - Take user input
        // Check weather the input is even or odd number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, I will tell you odd or even");
        int num = sc.nextInt();

        // Modulus -> %
        //   10%2 == Even -> 0
        //   10%2 == Odd -> 1

        if(num%2 == 0){
            System.out.println("Num is -> even");
        }else{
            System.out.println("Num is Odd!");
        }

        sc.close();
    }
}
