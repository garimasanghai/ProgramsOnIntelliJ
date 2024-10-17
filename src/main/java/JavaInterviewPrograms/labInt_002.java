package JavaInterviewPrograms;

//WAP that classifies a triangle based on its side lengths.

//Given three input values representing the lengths of the sides. Determine if the triangle is
// equilateral (all sides equal), isosceles (two sides are equal), or scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side2 → eq, iso, scalene

import java.util.Scanner;

public class labInt_002 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the first value");
        int sideA = sc.nextInt();
        System.out.println("Enter the second value");
        int sideB = sc.nextInt();
        System.out.println("Enter the third value");
        int sideC = sc.nextInt();

        if(sideA == sideB && sideB == sideC && sideC == sideA){
            System.out.println("It is an EQUILATERAL Triangle");
        }
        else if(sideA == sideB || sideB == sideC || sideC == sideA){
            System.out.println("It is an ISOSCELES Triangle");
        }
        else{
            System.out.println("It is a SCALENE Triangle");
        }

    }
}
