package Array;

import java.util.Scanner;

public class lab_057arrayFindDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size by User");
        int size = sc.nextInt();
        //Now create an array
        int [] numbers = new int[size];

        //User will input the number
        for(int i = 0; i<size; i++) {
            System.out.println("Enter the numbers: ");
            numbers[i]= sc.nextInt();
        }

        //Now iterate through each element to find duplicates
        for (int j = 0; j<numbers.length; j++) {
            //j is index of the current element
            for (int k = j+1; k < numbers.length; k++) {
                //This another loop starts from j + 1, means it starts from the next element
                // after the current j & continues till the end of the array.
                //k is the index of element being compared with element at index j
                if (numbers[j] == numbers[k]) {
                    //This checks if element at index j is equal to element at index k.
                    //If num[j] & num[k] are equal, it means a duplicate is found.

                    System.out.println("Duplicate found");
                }

            }
        }
        /*for (int j = 0; j<num.length; j++) {
            for (int k = j+1; k < num.length; k++) {

                if (num[j] == num[k]) {

                    System.out.println("Duplicate found");

                }

            }
        }*/
    }
}
