package Array;

import java.util.Scanner;

public class lab_063arrayLeftAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows");
        int size = sc.nextInt();
        int [] triangleSize = new int[size];

        for(int i = 0; i < triangleSize.length; i++){
            for(int j = i; j < triangleSize.length; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
