package org.epam.courses.view;

public class View {

    /**
     * method for printing any message
     * @param MESSAGE some String message
     */
    public void printMessage(String MESSAGE){
        System.out.println(MESSAGE);
    }

    /**
     *
     * @param matrix two-dimensional array that consist random matrix
     * @param turnedMatrix two-dimensional array that consist turned random matrix
     */
    public void printResults(int[][] matrix, int[][] turnedMatrix){
        System.out.println("RANDOM matrix: ");
        printMatrix(matrix);
        System.out.println("TURNED matrix: ");
        printMatrix(turnedMatrix);
    }

    /**
     * method for printing any two-dimensional array
     * @param matrix two-dimensional array
     */
    private void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                    System.out.printf("%4d; ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
