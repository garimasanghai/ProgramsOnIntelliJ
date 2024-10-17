package TernaryOperators;

public class lab_015 {
    public static void main(String[] args) {
        int a = 40;
        int b = 60;
        int c = 90;

        int maxVal =((a>= b && a >= c) ? a :(b>=c)? b:c);
        System.out.println("The maximum value is = " + maxVal);
    }
}
