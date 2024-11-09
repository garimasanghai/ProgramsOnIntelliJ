package Array;

public class lab_071starPyramidTriangle {
    public static void main(String[] args) {
        for( int i = 1; i <=4; i ++){ //This will be constant for all prog in start pattern
            for(int j=4; j>=i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++){
                //System.out.print("*" + " "); OR
                //System.out.print(" " + "*"); OR
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("This is a Star Pyramid Triangle");
    }
}
