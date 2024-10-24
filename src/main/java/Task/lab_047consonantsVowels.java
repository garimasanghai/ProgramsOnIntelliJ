package Task;

import java.util.Scanner;
//Count vowels and consonants in a String
//Hint2 -  For → if ch = ‘a’ → count++

public class lab_047consonantsVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");

        //nextLine() -Scanner method that reads a line of text until it hits Enter
        //toLowerCase() -String method that converts all character in the text to lowercase
        String alpha = sc.nextLine().toLowerCase(); // formula
        System.out.println("User input is: " + alpha);
        int vowels= 0;
        int consonants= 0;

        for(int i = 0; i<alpha.length(); i++){
            char ch = alpha.charAt(i);

            if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
                System.out.println(alpha + " - is a vowel");
            }
            else if (ch>= 'a' && ch <='z'){
                consonants++;
                System.out.println(alpha + " - is a consonant");
            }
        }
        sc.close();
    }
}
