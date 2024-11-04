package Array;

import java.util.Scanner;

public class lab_064arrayRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows");
        int size = sc.nextInt();
        int [] rectangleSize = new int[size];

        for(int i = 0; i < rectangleSize.length; i++){
            for(int j = 0; j < rectangleSize.length; j++) { // will always give u columns
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
