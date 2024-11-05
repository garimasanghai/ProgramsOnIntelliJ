package Array;

public class lab_065arraySquare {
    public static void main(String[] args) {
        String [][] matrix = {{"*","*","*","*"}, {"*","*","*","*"}, {"*","*","*","*"}, {"*","*","*","*"}};
        for(int i = 0; i<matrix.length; i++){// will give u rows
            for(int j = 0; j< matrix[i].length; j++){// will give u column
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}
