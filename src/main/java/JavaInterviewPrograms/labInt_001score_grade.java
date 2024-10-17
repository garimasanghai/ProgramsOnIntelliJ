package JavaInterviewPrograms;

//Question- Grade Calculator:
// WAP that calculates & displays the letter grade for a given numerical score
// (e.g., A, B, C, D, or F) based on the following grading scale:

//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59

// Logic Building - Java

// Step 1 :
// Find the inputs / outputs
// Input | score -> (0 - 100) -> data type -> int
// Output | grade -> data type -> char

// Step 2: Basic Logic |  Rough Logic
// if ( score >= 90 && score <= 100 ) -> return or print grade - A
// else if score <=89 && score >= 80 -> return or print grade - B
// else if score <=79 && score >= 70 -> return or print grade - C
//else if score <=69 && score >= 60 -> return or print grade - D
// else -> grade -> F

// Step 3: Write the code

import java.util.Scanner;

public class labInt_001score_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Score");
        int score = sc.nextInt();

        if(score<= 90 && score >=100){
            System.out.println("Your grade is A");
        }
        else if(score<=89 && score >=80){
            System.out.println("Your grade is B");
        }
        else if(score<= 79 && score >=70){
            System.out.println("Your garde is C");
        }
        else if(score<=69 && score >= 60){
            System.out.println("Your grade is D");
        }
        else{
            System.out.println("Your grade is F");
        }
    }
}
