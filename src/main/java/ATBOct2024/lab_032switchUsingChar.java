package ATBOct2024;

public class lab_032switchUsingChar {
    public static void main(String[] args) {
        char code = 'C'; //Asci value of the character will be considered
        switch (code) {
            default:
                System.out.println("Hellooooooo");
                break;
            case 'A':
                System.out.println("65"); // Asci valu of 'A'
                break;
            case 'B':
                System.out.println("66"); //Asci value of 'B'
                break;
        }
    }
}
