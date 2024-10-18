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

import java.sql.SQLOutput;
import java.util.Scanner;

public class labInt_001score_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Score");
        int score = sc.nextInt();
        char grade ='F';

        if(score<= 90 && score >=100){
            grade = 'A';
        }
        else if(score<=89 && score >=80){
            grade = 'B';
        }
        else if(score<= 79 && score >=70){
            grade = 'C';
        }
        else if(score<=69 && score >= 60){
            grade = 'D';
        }
        else if (score <= 0 || score > 100) {
            System.out.println("Kudos!! Aren't you the BRIGHTEST!!!");
            grade = 'O';
        }
        else{
            grade = 'F';
        }
        System.out.println("Your grade is ---> " + grade);

        sc.close();
    }
}
