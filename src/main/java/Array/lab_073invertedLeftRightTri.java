package Array;

public class lab_073invertedLeftRightTri {
    public static void main(String[] args) {
        for(int i = 1; i<=4; i++){ //This will remain constant for all start prog
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=4; k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("This is Inverted Left Right Angled Triangle");
    }
}
