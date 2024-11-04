package Array;

public class lab_062arrayRightAngleTriangle {
    public static void main(String[] args) {
        String [][] matrix = {{"*"}, {"*","*"}, {"*","*","*"},  {"*","*","*","*"}};
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++) { // will always give u columns
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
