package JavaInterviewPrograms;

/*
WAP that classifies a triangle based on its side lengths.

Given three input values representing the lengths of the sides. Determine if the triangle is
equilateral (all sides equal), isosceles (two sides are equal), or scalene (no sides are equal).
Use an if-else statement to classify the triangle.
side1, side2, side2 → eq, iso, scalene
*/

import java.util.Scanner;

public class labInt_002sides_triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of side A: ");
        double sideA = sc.nextDouble();
        System.out.println("Enter the length of side B: ");
        double sideB = sc.nextDouble();
        System.out.println("Enter the length of side C: ");
        double sideC = sc.nextDouble();

        if(sideA <= 0 || sideB <= 0 || sideC <=0){
            System.out.println("INVALID Input: Provide a positive number");
        }
        else if(sideA == sideB && sideB == sideC && sideA == sideC){
            System.out.println("It is an EQUILATERAL Triangle");
        }
        else if(sideA == sideB || sideB == sideC || sideC == sideA){
            System.out.println("It is an ISOSCELES Triangle");
        }
        else{
            System.out.println("It is a SCALENE Triangle");
        }
        sc.close();
    }
}
