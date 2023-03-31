
import java.util.Random;

class Matrix {
    private final int[][] matrix;
    private final int rows;
    private final int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
    }

    public void fillRandom() {
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
    }

    public void print() {
        System.out.println("_____");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("_____");
    }


    public void flip(){
        int[] temporaryMatrix = new int[rows];
         for (int i = 0 ; i < rows ; i++){

             temporaryMatrix[i] =  matrix[0][i] ;
            }

        for (int i = 0 ; i < rows ; i++){

            matrix[0][i] =  matrix[2][i];
        }



        for (int i = 0 ; i < rows ; i++){

            matrix[2][i] =  temporaryMatrix[i];
        }

        }


    }




public class zad2_6 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);
        matrix.fillRandom();
        matrix.print();
        matrix.flip();
        matrix.print();
    }
}