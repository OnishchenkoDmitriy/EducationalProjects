package org.epam.courses.model;

import static org.epam.courses.model.GlobalConstants.MAX_VALUE;
import static org.epam.courses.model.GlobalConstants.MIN_VALUE;

public class RandomMatrix {

    private int randomMatrixSize;
    private int[][] randomMatrix;
    private int[][] turnedRandomMatrix;

    public RandomMatrix(int matrixSize) {
        this.randomMatrixSize = matrixSize;
        randomMatrix = new int[randomMatrixSize][randomMatrixSize];
        turnedRandomMatrix = new int[randomMatrixSize][randomMatrixSize];
    }

    /**
     * generate random matrix with size randomMatrixSize
     */
    public void generateRandomMatrix(){
        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix.length; j++) {
                randomMatrix[i][j] = randomValueGenerator();
            }
        }
    }

    /**
     * generate turned random matrix
     */
    public void generateTurnedMatrix(){
        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix.length; j++) {
                turnedRandomMatrix[i][j] = randomMatrix[j][randomMatrix.length - i - 1];
            }
        }
    }

    public int[][] getRandomMatrix() {
        return randomMatrix;
    }

    public int[][] getTurnedMatrix() {
        return turnedRandomMatrix;
    }

    /**
     *
     * @return random int value with is in the range between MAX_VALUE and MIN_VALUE
     */
    private int randomValueGenerator(){
        return (int)Math.ceil(Math.random() * (MAX_VALUE - MIN_VALUE - 1) + MIN_VALUE);
    }
}
