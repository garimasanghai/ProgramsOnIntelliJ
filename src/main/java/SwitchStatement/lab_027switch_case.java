package SwitchStatement;
import java.util.Scanner;

//WAP to print the days if the number is given from 1-7 else invalid input

public class lab_027switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 1-7");
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Provide VALID input for VALID output");
                break;
        }
        System.out.println("You have come out of loop");
        sc.close();
    }
}
