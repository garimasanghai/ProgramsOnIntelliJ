package PracticeInterviewProg;

public class CheckOddOrEven {
    public static void main(String[] args) {
        // WAP to check whether a number is Even or Odd

        int i = 3;

        if (i == 0) {
            System.out.println("Invalid input");
        } else if (i % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }
}
