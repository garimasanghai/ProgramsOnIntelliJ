package JavaInterviewPrograms;

import java.util.Scanner;

//Reverse the number using for loop. (In - 12345, Out - 54321)
// Hint 1  - num/10 -

public class lab_046reverseNumUsingLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = sc.nextInt();
        int reverseNum = 0;

        for(; num!=0; ){
            //formula
            int randomNum = num%10;
            reverseNum = reverseNum * 10 + randomNum;
            num= num/10;
        }
        System.out.println("The reversed num is: " + reverseNum);

    }
}
/*
Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

int reverse=0;
        for(int num = sc.nextInt(); num>0; ){
int rem = num%10;
reverse = reverse*10 + rem;
num =num/10;
        }
        System.out.println(reverse);
    }*/