package Array;

public class lab_070comboTriangles {
    public static void main(String[] args) {
        for (int i = 1; i <=4; i ++){
            for(int j = 1; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for(int i = 1; i<=4; i++){
            for(int j=3; j>=i; j--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println("Combination of Right & Inverted Right Angled Triangle");
    }
}
