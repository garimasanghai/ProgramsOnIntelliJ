package WhileLoop;

//Diff. b/w while & do..while is:
// In do...while it will run at least once even before the cond. is checked

public class lab_044_DoWhile {
    public static void main(String[] args) {
        int a = 0;
        do {
            System.out.println("Run a Code -> " + a); //Enter the loop & will run at least once
            a++;
        }
        while (a < 10); // then the cond. is checked
    }
}
