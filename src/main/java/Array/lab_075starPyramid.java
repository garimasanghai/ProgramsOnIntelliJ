package Array;

public class lab_075starPyramid {
    public static void main(String[] args) {
        System.out.println("This is a Star Pyramid");
        for(int i=1; i<=4; i++){  //for rows
            for(int j=4; j>=i; j--){ //for spaces
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){ // to print *
                System.out.print("*");
            }
            //next triangle starts
            for(int l=2; l<=i; l++){ //for rows that starts from second line
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=4; k>=i; k--){
                System.out.print("*");
            }
            for(int l=3; l>=i; l--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("This is an Inverted Star Pyramid");
    }
}
