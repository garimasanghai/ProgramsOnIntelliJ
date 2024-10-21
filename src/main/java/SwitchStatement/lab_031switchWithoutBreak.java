package SwitchStatement;

import java.util.Scanner;

//Without adding break in programs u can exe single line of code

public class lab_031switchWithoutBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item code:");
        int itemCode = sc.nextInt();

        switch(itemCode){
            case 002 -> System.out.println("Stationary");
            case 003 -> System.out.println("Medical");
            case 004 -> System.out.println("Sports");
            default -> System.out.println("Yet to be fed in System");
        }
        sc.close();
    }
}
