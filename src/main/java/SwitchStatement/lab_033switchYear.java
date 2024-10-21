package SwitchStatement;

import java.util.Scanner;
/*
WAP that takes int input (1-12) & prints name of the corresponding month using switch statement
Input - 12
Out - Dec.
*/
public class lab_033switchYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number b/w 1-12 :");
        int month = sc.nextInt();
        switch(month){
            case 1 -> System.out.println("Jan");
            case 2 -> System.out.println("Feb");
            case 3 -> System.out.println("Mar");
            case 4 -> System.out.println("Apr");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("Jun");
            case 7 -> System.out.println("Jul");
            case 8 -> System.out.println("Aug");
            case 9 -> System.out.println("Sept");
            case 10 -> System.out.println("Oct");
            case 11 -> System.out.println("Nov");
            case 12 -> System.out.println("Dec");
            default -> System.out.println("Invent your own Calendar");
        }
        sc.close();
    }
}
