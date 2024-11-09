package Array;

public class lab_074comboLeftRightTri {
    public static void main(String[] args) {
        for(int i =1; i<=4; i++) {
            for (int j = 3; j >= i; j--) { //it will create spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
            for(int i = 1; i<=4; i++){
                for(int j =1; j<=i; j++){ //it will create spaces
                    System.out.print(" ");
                }
                for(int k= 3; k>=i; k--){
                    System.out.print("*");
                }
                System.out.println();
            }
        System.out.println("Combo of Left-Right & Inverted Left-Right Angled Tri");
        }
    }
