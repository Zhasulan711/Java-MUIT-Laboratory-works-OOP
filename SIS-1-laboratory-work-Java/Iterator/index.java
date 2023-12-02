package Iterator;

import java.util.Iterator;

public class index {
    public static void main(String[] args) {
        Integer[][] matrixData = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Matrix<Integer> matrix = new Matrix<>(matrixData);

        System.out.println("Iterating through the matrix:");
        for (Integer value : matrix) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
