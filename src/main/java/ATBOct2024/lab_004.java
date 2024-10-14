package ATBOct2024;

public class lab_004 {
    public static void main(String[] args) {

        //Compound operator
        int num = 7;
        System.out.println("Num + 3  =  " + (num += 3));
        //The value of num is updated at every operation.
        System.out.println("Num - 4  =  " + (num -= 4));
        System.out.println("Num * 5  =  " + (num *= 5));
        System.out.println("Num / 6  =  " + (num /= 6));
        System.out.println("Num % 7  =  " + (num %= 7));

    }
}
