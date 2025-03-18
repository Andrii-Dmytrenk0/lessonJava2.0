package src.lesson4;

import java.util.Arrays;
import java.util.ArrayList;

public class MatrixExample {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };


        System.out.println("2D Array (Matrix): ");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[] flatArray = flattenMatrix(matrix);

        System.out.println("Flattened Array: " + Arrays.toString(flatArray));


        Arrays.sort(flatArray);
        System.out.println("sorted Array: " + Arrays.toString(flatArray));
    }

    public static int[] flattenMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] flatArray = new int[rows * cols];

        int index = 0;
        for (int i = 0;i < rows; i++){
            for (int j = 0; j < cols; j++){
                flatArray[index++] = matrix[i][j];
            }
        }
        return flatArray;
    }
}
