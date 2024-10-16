package ATBOct2024;

public class lab_012 {
    public static void main(String[] args) {

        //Syntax:- result = (condition1)? "expression1" : (condition2)? "expression2" : "expression3";
        int a = 90;
        int b = 100;
        int c = 900;

        int maxVal= (a > b)? a : (b > c)? b : c;
        System.out.println("The maximum value is = " + maxVal);


    }
}
