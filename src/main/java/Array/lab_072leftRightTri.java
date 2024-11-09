package Array;

//Same logic applied as in combination of Right & Inverted Right Triangle
public class lab_072leftRightTri {
    public static void main(String[] args) {
        for(int i= 1; i<=4; i++){
            for(int j= 4; j>=i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("This is left Right Angled Triangle");
    }
}
