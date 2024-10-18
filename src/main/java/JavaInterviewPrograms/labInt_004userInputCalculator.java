package JavaInterviewPrograms;

import java.util.Scanner;
/*
Create simple calculator that performs +, -, *, /, % based on user input using switch statements
Inputs :   num 1, num 2, +
Output :  num1+num2 → print information.
*/

public class labInt_004userInputCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        double num1 = sc.nextDouble();
        System.out.println("Enter num2:");
        double num2 = sc.nextDouble();

        if (num2>num1){
            System.out.println("Enter the operator:");
            String operator = sc.next();

            switch(operator){
                case "+":
                    System.out.println("The sum is: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("The difference is: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("The product is: " + (num1 * num2));
                    break;
                case "/":
                    System.out.println("The divisor is: " + (num1/num2));
                    break;
                case "%":
                    System.out.println("The remainder is: " + (num1 % num2));
                    break;
                default:
                    System.out.println("Please check the input again");
                    break;
            }
        }
        else{
            System.out.println("num2 should be greater than num1");
        }
    }
}
